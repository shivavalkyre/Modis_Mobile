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

public class home extends Activity implements B4AActivity{
	public static home mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.modis", "com.modis.home");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (home).");
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
		activityBA = new BA(this, layout, processBA, "com.modis", "com.modis.home");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.modis.home", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (home) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (home) Resume **");
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
		return home.class;
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
            BA.LogInfo("** Activity (home) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (home) Pause event (activity is not paused). **");
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
            home mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (home) Resume **");
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
public com.modis.b4xdrawer _drawer = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14 = null;
public com.modis.asradiobutton _asradiobutton1 = null;
public com.modis.asradiobutton _asradiobutton2 = null;
public com.modis.asradiobutton _asradiobutton3 = null;
public com.modis.asradiobutton _asradiobutton5 = null;
public com.modis.asradiobutton _asradiobutton4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label16 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label19 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label20 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview4 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelclosesidebar = null;
public b4a.example3.customlistview _clvsidebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblisisidebar = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageviewsidebar = null;
public b4a.example.dateutils _dateutils = null;
public com.modis.main _main = null;
public com.modis.starter _starter = null;
public com.modis.general _general = null;
public com.modis.register _register = null;
public com.modis.absensi _absensi = null;
public com.modis.xuiviewsutils _xuiviewsutils = null;
public com.modis.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
int _i = 0;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim window As JavaObject = jo.InitializeContext.R";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.InitializeContext(processBA).RunMethod("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="window.RunMethod(\"addFlags\", Array(Bit.Or(0x00000";
_window.RunMethod("addFlags",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.Bit.Or((int) (0x00000200),(int) (0x08000000)))});
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Activity.Height = Activity.Height + 24dip";
mostCurrent._activity.setHeight((int) (mostCurrent._activity.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24))));
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Drawer.Initialize(Me, \"Drawer\", Activity, 280dip)";
mostCurrent._drawer._initialize /*String*/ (null,mostCurrent.activityBA,home.getObject(),"Drawer",(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (280)));
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="Drawer.CenterPanel.LoadLayout(\"Home\")";
mostCurrent._drawer._getcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).LoadLayout("Home",mostCurrent.activityBA);
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="Drawer.LeftPanel.LoadLayout(\"LayoutDrawer\")";
mostCurrent._drawer._getleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).LoadLayout("LayoutDrawer",mostCurrent.activityBA);
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Dim i As Int =0";
_i = (int) (0);
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="For i=0 To 4";
{
final int step9 = 1;
final int limit9 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="CLVSidebar.Add(CreateListItem(CLVSidebar.AsView.W";
mostCurrent._clvsidebar._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistitem(mostCurrent._clvsidebar._asview().getWidth(),mostCurrent._clvsidebar._asview().getHeight(),_i).getObject())),(Object)(_i));
 }
};
RDebugUtils.currentLine=1769491;
 //BA.debugLineNum = 1769491;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitem(int _width,int _height,int _i) throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createlistitem", new Object[] {_width,_height,_i}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Sub CreateListItem(Width As Int, Height As Int,i A";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=30539779;
 //BA.debugLineNum = 30539779;BA.debugLine="p.SetLayout(0, 0, Width, 60dip)";
_p.SetLayout((int) (0),(int) (0),_width,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=30539780;
 //BA.debugLineNum = 30539780;BA.debugLine="p.LoadLayout(\"LayoutIsIDrawer\")";
_p.LoadLayout("LayoutIsIDrawer",mostCurrent.activityBA);
RDebugUtils.currentLine=30539781;
 //BA.debugLineNum = 30539781;BA.debugLine="Select Case i";
switch (_i) {
case 0: {
RDebugUtils.currentLine=30539783;
 //BA.debugLineNum = 30539783;BA.debugLine="LblisiSidebar.Text=\"Jadwal\"";
mostCurrent._lblisisidebar.setText(BA.ObjectToCharSequence("Jadwal"));
RDebugUtils.currentLine=30539784;
 //BA.debugLineNum = 30539784;BA.debugLine="ImageViewSidebar.Bitmap= LoadBitmap(File.DirAss";
mostCurrent._imageviewsidebar.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Group 286.png").getObject()));
 break; }
case 1: {
RDebugUtils.currentLine=30539786;
 //BA.debugLineNum = 30539786;BA.debugLine="LblisiSidebar.Text=\"Lembur\"";
mostCurrent._lblisisidebar.setText(BA.ObjectToCharSequence("Lembur"));
 break; }
case 2: {
RDebugUtils.currentLine=30539788;
 //BA.debugLineNum = 30539788;BA.debugLine="LblisiSidebar.Text=\"Dinas\"";
mostCurrent._lblisisidebar.setText(BA.ObjectToCharSequence("Dinas"));
 break; }
case 3: {
RDebugUtils.currentLine=30539790;
 //BA.debugLineNum = 30539790;BA.debugLine="LblisiSidebar.Text=\"Cuti\"";
mostCurrent._lblisisidebar.setText(BA.ObjectToCharSequence("Cuti"));
 break; }
case 4: {
RDebugUtils.currentLine=30539792;
 //BA.debugLineNum = 30539792;BA.debugLine="LblisiSidebar.Text=\"Sakit\"";
mostCurrent._lblisisidebar.setText(BA.ObjectToCharSequence("Sakit"));
 break; }
}
;
RDebugUtils.currentLine=30539794;
 //BA.debugLineNum = 30539794;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=30539795;
 //BA.debugLineNum = 30539795;BA.debugLine="End Sub";
return null;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="home";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public static String  _imageview4_click() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imageview4_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imageview4_click", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub ImageView4_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Panel3.SetVisibleAnimated(200,False)";
mostCurrent._panel3.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="StartActivity(Absensi)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._absensi.getObject()));
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
return "";
}
public static String  _imageview5_click() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imageview5_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imageview5_click", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub ImageView5_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Panel3.SetVisibleAnimated(200,False)";
mostCurrent._panel3.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="StartActivity(Absensi)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._absensi.getObject()));
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return "";
}
public static String  _label14_click() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label14_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label14_click", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub Label14_Click";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="ASRadioButton3.Checked = True";
mostCurrent._asradiobutton3._setchecked /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _label15_click() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label15_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label15_click", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub Label15_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="ASRadioButton4.Checked = True";
mostCurrent._asradiobutton4._setchecked /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public static String  _label16_click() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label16_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label16_click", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub Label16_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="ASRadioButton5.Checked = True";
mostCurrent._asradiobutton5._setchecked /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _label2_click() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label2_click", null));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="Drawer.LeftOpen=True";
mostCurrent._drawer._setleftopen /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="End Sub";
return "";
}
public static String  _label6_click() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label6_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label6_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub Label6_Click";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Panel1.SendToBack";
mostCurrent._panel1.SendToBack();
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Panel12.SendToBack";
mostCurrent._panel12.SendToBack();
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Panel3.BringToFront";
mostCurrent._panel3.BringToFront();
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Panel3.SetVisibleAnimated(200,True)";
mostCurrent._panel3.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="End Sub";
return "";
}
public static String  _label7_click() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label7_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label7_click", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub Label7_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="ASRadioButton1.Checked = True";
mostCurrent._asradiobutton1._setchecked /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _label8_click() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label8_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label8_click", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub Label8_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="ASRadioButton2.Checked = True";
mostCurrent._asradiobutton2._setchecked /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _labelclosesidebar_click() throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelclosesidebar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelclosesidebar_click", null));}
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Private Sub LabelCloseSidebar_Click";
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="Drawer.LeftOpen=False";
mostCurrent._drawer._setleftopen /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="End Sub";
return "";
}
public static String  _panel3_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panel3_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panel3_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub Panel3_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Panel3.SetVisibleAnimated(200,False)";
mostCurrent._panel3.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
}