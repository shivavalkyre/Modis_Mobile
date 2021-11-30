package com.modis;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class absensi extends Activity implements B4AActivity{
	public static absensi mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.modis", "com.modis.absensi");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (absensi).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.modis", "com.modis.absensi");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.modis.absensi", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (absensi) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (absensi) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return absensi.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (absensi) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (absensi) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            absensi mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (absensi) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _frontcamera = false;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public com.modis.camex2 _cam = null;
public static int _mytaskindex = 0;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcamera = null;
public static boolean _videomode = false;
public static String _videofiledir = "";
public static String _videofilename = "";
public b4a.example.dateutils _dateutils = null;
public com.modis.main _main = null;
public com.modis.starter _starter = null;
public com.modis.general _general = null;
public com.modis.register _register = null;
public com.modis.home _home = null;
public com.modis.xuiviewsutils _xuiviewsutils = null;
public com.modis.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="absensi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Activity.LoadLayout(\"Absensi\")";
mostCurrent._activity.LoadLayout("Absensi",mostCurrent.activityBA);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="cam.Initialize(pnlCamera)";
mostCurrent._cam._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._pnlcamera);
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="End Sub";
return "";
}
public static void  _opencamera(boolean _front) throws Exception{
RDebugUtils.currentModule="absensi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "opencamera", false))
	 {Debug.delegate(mostCurrent.activityBA, "opencamera", new Object[] {_front}); return;}
ResumableSub_OpenCamera rsub = new ResumableSub_OpenCamera(null,_front);
rsub.resume(processBA, null);
}
public static class ResumableSub_OpenCamera extends BA.ResumableSub {
public ResumableSub_OpenCamera(com.modis.absensi parent,boolean _front) {
this.parent = parent;
this._front = _front;
}
com.modis.absensi parent;
boolean _front;
String _permission = "";
boolean _result = false;
int _taskindex = 0;
boolean _success = false;
Object[] group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="absensi";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="For Each permission As String In Array(rp.PERMISS";
if (true) break;

case 1:
//for
this.state = 8;
group1 = new Object[]{(Object)(parent._rp.PERMISSION_CAMERA)};
index1 = 0;
groupLen1 = group1.length;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 8;
if (index1 < groupLen1) {
this.state = 3;
_permission = BA.ObjectToString(group1[index1]);}
if (true) break;

case 18:
//C
this.state = 17;
index1++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="rp.CheckAndRequest(permission)";
parent._rp.CheckAndRequest(processBA,_permission);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Wait For Activity_PermissionResult (permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "absensi", "opencamera"), null);
this.state = 19;
return;
case 19:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="If Result = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No permission!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 18;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="Wait For (cam.OpenCamera(front)) Complete (TaskIn";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "absensi", "opencamera"), parent.mostCurrent._cam._opencamera /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_front));
this.state = 20;
return;
case 20:
//C
this.state = 9;
_taskindex = (Integer) result[0];
;
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="If TaskIndex > 0 Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_taskindex>0) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="MyTaskIndex = TaskIndex 'hold this index. It wil";
parent._mytaskindex = _taskindex;
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="Wait For(PrepareSurface) Complete (Success As Bo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "absensi", "opencamera"), _preparesurface());
this.state = 21;
return;
case 21:
//C
this.state = 12;
_success = (Boolean) result[0];
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="Log(\"Start success: \" & Success)";
anywheresoftware.b4a.keywords.Common.LogImpl("82883602","Start success: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="If Success = False Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_success==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="ToastMessageShow(\"Failed to open camera\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Failed to open camera"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=2883607;
 //BA.debugLineNum = 2883607;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="absensi";
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="absensi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparesurface() throws Exception{
RDebugUtils.currentModule="absensi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "preparesurface", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "preparesurface", null));}
ResumableSub_PrepareSurface rsub = new ResumableSub_PrepareSurface(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSurface extends BA.ResumableSub {
public ResumableSub_PrepareSurface(com.modis.absensi parent) {
this.parent = parent;
}
com.modis.absensi parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="absensi";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="If VideoMode Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._videomode) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="cam.PreviewSize.Initialize(640, 480)";
parent.mostCurrent._cam._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ .Initialize((int) (640),(int) (480));
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="ResizePreviewPanelBasedPreviewSize";
_resizepreviewpanelbasedpreviewsize();
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Wait For (cam.PrepareSurfaceForVideo(MyTaskIndex";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "absensi", "preparesurface"), parent.mostCurrent._cam._preparesurfaceforvideo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._mytaskindex,parent.mostCurrent._videofiledir,"temp-"+parent.mostCurrent._videofilename));
this.state = 12;
return;
case 12:
//C
this.state = 6;
_success = (Boolean) result[0];
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="cam.PreviewSize.Initialize(1920, 1080)";
parent.mostCurrent._cam._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ .Initialize((int) (1920),(int) (1080));
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="ResizePreviewPanelBasedPreviewSize";
_resizepreviewpanelbasedpreviewsize();
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="Wait For (cam.PrepareSurface(MyTaskIndex)) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "absensi", "preparesurface"), parent.mostCurrent._cam._preparesurface /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._mytaskindex));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_success = (Boolean) result[0];
;
 if (true) break;
;
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="If Success Then cam.StartPreview(MyTaskIndex, Vid";

case 6:
//if
this.state = 11;
if (_success) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
parent.mostCurrent._cam._startpreview /*String*/ (null,parent._mytaskindex,parent._videomode);
if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=2949139;
 //BA.debugLineNum = 2949139;BA.debugLine="Return Success";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _panel3_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="absensi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panel3_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panel3_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub Panel3_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public static String  _resizepreviewpanelbasedpreviewsize() throws Exception{
RDebugUtils.currentModule="absensi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "resizepreviewpanelbasedpreviewsize", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "resizepreviewpanelbasedpreviewsize", null));}
int _pw = 0;
int _ph = 0;
float _r = 0f;
int _w = 0;
int _h = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub ResizePreviewPanelBasedPreviewSize";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim pw = cam.PreviewSize.Height, ph = cam.Preview";
_pw = mostCurrent._cam._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ .getHeight();
_ph = mostCurrent._cam._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ .getWidth();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim r As Float = Max(Activity.Width / pw, Activit";
_r = (float) (anywheresoftware.b4a.keywords.Common.Max(mostCurrent._activity.getWidth()/(double)_pw,mostCurrent._activity.getHeight()/(double)_ph));
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Dim w As Int = pw * r";
_w = (int) (_pw*_r);
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Dim h As Int = ph * r";
_h = (int) (_ph*_r);
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="pnlCamera.SetLayoutAnimated(0, Round(Activity.Wid";
mostCurrent._pnlcamera.SetLayoutAnimated((int) (0),(int) (anywheresoftware.b4a.keywords.Common.Round(mostCurrent._activity.getWidth()/(double)2-_w/(double)2)),(int) (anywheresoftware.b4a.keywords.Common.Round(mostCurrent._activity.getHeight()/(double)2-_h/(double)2)),(int) (anywheresoftware.b4a.keywords.Common.Round(_w)),(int) (anywheresoftware.b4a.keywords.Common.Round(_h)));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="End Sub";
return "";
}
}