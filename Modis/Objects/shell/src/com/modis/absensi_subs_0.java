package com.modis;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class absensi_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (absensi) ","absensi",5,absensi.mostCurrent.activityBA,absensi.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return com.modis.absensi.remoteMe.runUserSub(false, "absensi","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"Absensi\")";
Debug.ShouldStop(16777216);
absensi.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Absensi")),absensi.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="cam.Initialize(pnlCamera)";
Debug.ShouldStop(33554432);
absensi.mostCurrent._cam.runClassMethod (com.modis.camex2.class, "_initialize" /*RemoteObject*/ ,absensi.mostCurrent.activityBA,(Object)(absensi.mostCurrent._pnlcamera));
 BA.debugLineNum = 27;BA.debugLine="OpenCamera(frontCamera)";
Debug.ShouldStop(67108864);
_opencamera(absensi._frontcamera);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (absensi) ","absensi",5,absensi.mostCurrent.activityBA,absensi.mostCurrent,37);
if (RapidSub.canDelegate("activity_pause")) { return com.modis.absensi.remoteMe.runUserSub(false, "absensi","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (absensi) ","absensi",5,absensi.mostCurrent.activityBA,absensi.mostCurrent,33);
if (RapidSub.canDelegate("activity_resume")) { return com.modis.absensi.remoteMe.runUserSub(false, "absensi","activity_resume");}
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private cam As CamEx2";
absensi.mostCurrent._cam = RemoteObject.createNew ("com.modis.camex2");
 //BA.debugLineNum = 17;BA.debugLine="Private MyTaskIndex As Int";
absensi._mytaskindex = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 18;BA.debugLine="Private pnlCamera As Panel";
absensi.mostCurrent._pnlcamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private VideoMode As Boolean = False";
absensi._videomode = absensi.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 20;BA.debugLine="Private VideoFileDir, VideoFileName As String";
absensi.mostCurrent._videofiledir = RemoteObject.createImmutable("");
absensi.mostCurrent._videofilename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _opencamera(RemoteObject _front) throws Exception{
try {
		Debug.PushSubsStack("OpenCamera (absensi) ","absensi",5,absensi.mostCurrent.activityBA,absensi.mostCurrent,42);
if (RapidSub.canDelegate("opencamera")) { com.modis.absensi.remoteMe.runUserSub(false, "absensi","opencamera", _front); return;}
ResumableSub_OpenCamera rsub = new ResumableSub_OpenCamera(null,_front);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_OpenCamera extends BA.ResumableSub {
public ResumableSub_OpenCamera(com.modis.absensi parent,RemoteObject _front) {
this.parent = parent;
this._front = _front;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.modis.absensi parent;
RemoteObject _front;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _taskindex = RemoteObject.createImmutable(0);
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("OpenCamera (absensi) ","absensi",5,absensi.mostCurrent.activityBA,absensi.mostCurrent,42);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("front", _front);
 BA.debugLineNum = 44;BA.debugLine="For Each permission As String In Array(rp.PERMISS";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//for
this.state = 8;
group1 = RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent._rp.getField(true,"PERMISSION_CAMERA"))});
index1 = 0;
groupLen1 = group1.getField(true,"length").<Integer>get();
Debug.locals.put("permission", _permission);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 8;
if (index1 < groupLen1) {
this.state = 3;
_permission = BA.ObjectToString(group1.getArrayElement(false,RemoteObject.createImmutable(index1)));Debug.locals.put("permission", _permission);}
if (true) break;

case 18:
//C
this.state = 17;
index1++;
Debug.locals.put("permission", _permission);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 45;BA.debugLine="rp.CheckAndRequest(permission)";
Debug.ShouldStop(4096);
parent._rp.runVoidMethod ("CheckAndRequest",absensi.processBA,(Object)(_permission));
 BA.debugLineNum = 46;BA.debugLine="Wait For Activity_PermissionResult (permission A";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", absensi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "absensi", "opencamera"), null);
this.state = 19;
return;
case 19:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 47;BA.debugLine="If Result = False Then";
Debug.ShouldStop(16384);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 48;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No permission!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 49;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 50;BA.debugLine="Return";
Debug.ShouldStop(131072);
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
Debug.locals.put("permission", _permission);
;
 BA.debugLineNum = 55;BA.debugLine="Wait For (cam.OpenCamera(front)) Complete (TaskIn";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", absensi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "absensi", "opencamera"), parent.mostCurrent._cam.runClassMethod (com.modis.camex2.class, "_opencamera" /*RemoteObject*/ ,(Object)(_front)));
this.state = 20;
return;
case 20:
//C
this.state = 9;
_taskindex = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("TaskIndex", _taskindex);
;
 BA.debugLineNum = 56;BA.debugLine="If TaskIndex > 0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_taskindex,BA.numberCast(double.class, 0))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 57;BA.debugLine="MyTaskIndex = TaskIndex 'hold this index. It wil";
Debug.ShouldStop(16777216);
parent._mytaskindex = _taskindex;
 BA.debugLineNum = 58;BA.debugLine="Wait For(PrepareSurface) Complete (Success As Bo";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", absensi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "absensi", "opencamera"), _preparesurface());
this.state = 21;
return;
case 21:
//C
this.state = 12;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 60;BA.debugLine="Log(\"Start success: \" & Success)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","82883602",RemoteObject.concat(RemoteObject.createImmutable("Start success: "),_success),0);
 BA.debugLineNum = 62;BA.debugLine="If Success = False Then";
Debug.ShouldStop(536870912);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_success,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 63;BA.debugLine="ToastMessageShow(\"Failed to open camera\", True)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Failed to open camera")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static void  _complete(RemoteObject _taskindex) throws Exception{
}
public static RemoteObject  _panel3_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Panel3_Touch (absensi) ","absensi",5,absensi.mostCurrent.activityBA,absensi.mostCurrent,98);
if (RapidSub.canDelegate("panel3_touch")) { return com.modis.absensi.remoteMe.runUserSub(false, "absensi","panel3_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 98;BA.debugLine="Private Sub Panel3_Touch (Action As Int, X As Floa";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparesurface() throws Exception{
try {
		Debug.PushSubsStack("PrepareSurface (absensi) ","absensi",5,absensi.mostCurrent.activityBA,absensi.mostCurrent,68);
if (RapidSub.canDelegate("preparesurface")) { return com.modis.absensi.remoteMe.runUserSub(false, "absensi","preparesurface");}
ResumableSub_PrepareSurface rsub = new ResumableSub_PrepareSurface(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PrepareSurface extends BA.ResumableSub {
public ResumableSub_PrepareSurface(com.modis.absensi parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.modis.absensi parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrepareSurface (absensi) ","absensi",5,absensi.mostCurrent.activityBA,absensi.mostCurrent,68);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 71;BA.debugLine="If VideoMode Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 6;
if (parent._videomode.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 72;BA.debugLine="cam.PreviewSize.Initialize(640, 480)";
Debug.ShouldStop(128);
parent.mostCurrent._cam.getField(false,"_previewsize" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 640)),(Object)(BA.numberCast(int.class, 480)));
 BA.debugLineNum = 73;BA.debugLine="ResizePreviewPanelBasedPreviewSize";
Debug.ShouldStop(256);
_resizepreviewpanelbasedpreviewsize();
 BA.debugLineNum = 75;BA.debugLine="Wait For (cam.PrepareSurfaceForVideo(MyTaskIndex";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", absensi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "absensi", "preparesurface"), parent.mostCurrent._cam.runClassMethod (com.modis.camex2.class, "_preparesurfaceforvideo" /*RemoteObject*/ ,(Object)(parent._mytaskindex),(Object)(parent.mostCurrent._videofiledir),(Object)(RemoteObject.concat(RemoteObject.createImmutable("temp-"),parent.mostCurrent._videofilename))));
this.state = 12;
return;
case 12:
//C
this.state = 6;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 77;BA.debugLine="cam.PreviewSize.Initialize(1920, 1080)";
Debug.ShouldStop(4096);
parent.mostCurrent._cam.getField(false,"_previewsize" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 1920)),(Object)(BA.numberCast(int.class, 1080)));
 BA.debugLineNum = 78;BA.debugLine="ResizePreviewPanelBasedPreviewSize";
Debug.ShouldStop(8192);
_resizepreviewpanelbasedpreviewsize();
 BA.debugLineNum = 82;BA.debugLine="Wait For (cam.PrepareSurface(MyTaskIndex)) Compl";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", absensi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "absensi", "preparesurface"), parent.mostCurrent._cam.runClassMethod (com.modis.camex2.class, "_preparesurface" /*RemoteObject*/ ,(Object)(parent._mytaskindex)));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 if (true) break;
;
 BA.debugLineNum = 85;BA.debugLine="If Success Then cam.StartPreview(MyTaskIndex, Vid";
Debug.ShouldStop(1048576);

case 6:
//if
this.state = 11;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
parent.mostCurrent._cam.runClassMethod (com.modis.camex2.class, "_startpreview" /*RemoteObject*/ ,(Object)(parent._mytaskindex),(Object)(parent._videomode));
if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 87;BA.debugLine="Return Success";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private frontCamera As Boolean = True";
absensi._frontcamera = absensi.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 10;BA.debugLine="Private rp As RuntimePermissions";
absensi._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _resizepreviewpanelbasedpreviewsize() throws Exception{
try {
		Debug.PushSubsStack("ResizePreviewPanelBasedPreviewSize (absensi) ","absensi",5,absensi.mostCurrent.activityBA,absensi.mostCurrent,90);
if (RapidSub.canDelegate("resizepreviewpanelbasedpreviewsize")) { return com.modis.absensi.remoteMe.runUserSub(false, "absensi","resizepreviewpanelbasedpreviewsize");}
RemoteObject _pw = RemoteObject.createImmutable(0);
RemoteObject _ph = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _h = RemoteObject.createImmutable(0);
 BA.debugLineNum = 90;BA.debugLine="Private Sub ResizePreviewPanelBasedPreviewSize";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Dim pw = cam.PreviewSize.Height, ph = cam.Preview";
Debug.ShouldStop(67108864);
_pw = absensi.mostCurrent._cam.getField(false,"_previewsize" /*RemoteObject*/ ).runMethod(true,"getHeight");Debug.locals.put("pw", _pw);Debug.locals.put("pw", _pw);
_ph = absensi.mostCurrent._cam.getField(false,"_previewsize" /*RemoteObject*/ ).runMethod(true,"getWidth");Debug.locals.put("ph", _ph);Debug.locals.put("ph", _ph);
 BA.debugLineNum = 92;BA.debugLine="Dim r As Float = Max(Activity.Width / pw, Activit";
Debug.ShouldStop(134217728);
_r = BA.numberCast(float.class, absensi.mostCurrent.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {absensi.mostCurrent._activity.runMethod(true,"getWidth"),_pw}, "/",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {absensi.mostCurrent._activity.runMethod(true,"getHeight"),_ph}, "/",0, 0))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 93;BA.debugLine="Dim w As Int = pw * r";
Debug.ShouldStop(268435456);
_w = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pw,_r}, "*",0, 0));Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 94;BA.debugLine="Dim h As Int = ph * r";
Debug.ShouldStop(536870912);
_h = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ph,_r}, "*",0, 0));Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 95;BA.debugLine="pnlCamera.SetLayoutAnimated(0, Round(Activity.Wid";
Debug.ShouldStop(1073741824);
absensi.mostCurrent._pnlcamera.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, absensi.mostCurrent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {absensi.mostCurrent._activity.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_w,RemoteObject.createImmutable(2)}, "/-/",1, 0))))),(Object)(BA.numberCast(int.class, absensi.mostCurrent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {absensi.mostCurrent._activity.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_h,RemoteObject.createImmutable(2)}, "/-/",1, 0))))),(Object)(BA.numberCast(int.class, absensi.mostCurrent.__c.runMethod(true,"Round",(Object)(BA.numberCast(double.class, _w))))),(Object)(BA.numberCast(int.class, absensi.mostCurrent.__c.runMethod(true,"Round",(Object)(BA.numberCast(double.class, _h))))));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}