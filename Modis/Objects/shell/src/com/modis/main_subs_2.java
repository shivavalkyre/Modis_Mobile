package com.modis;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_2 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { com.modis.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(com.modis.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.modis.main parent;
RemoteObject _firsttime;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _window = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="For Each permission As String In Array(rp.PERMISS";
Debug.ShouldStop(1);
if (true) break;

case 1:
//for
this.state = 8;
group1 = RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent._rp.getField(true,"PERMISSION_CAMERA"))});
index1 = 0;
groupLen1 = group1.getField(true,"length").<Integer>get();
Debug.locals.put("permission", _permission);
this.state = 9;
if (true) break;

case 9:
//C
this.state = 8;
if (index1 < groupLen1) {
this.state = 3;
_permission = BA.ObjectToString(group1.getArrayElement(false,RemoteObject.createImmutable(index1)));Debug.locals.put("permission", _permission);}
if (true) break;

case 10:
//C
this.state = 9;
index1++;
Debug.locals.put("permission", _permission);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 34;BA.debugLine="rp.CheckAndRequest(permission)";
Debug.ShouldStop(2);
parent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(_permission));
 BA.debugLineNum = 35;BA.debugLine="Wait For Activity_PermissionResult (permission A";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), null);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 36;BA.debugLine="If Result = False Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 37;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No permission!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 38;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 39;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
Debug.locals.put("permission", _permission);
;
 BA.debugLineNum = 44;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(2048);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 45;BA.debugLine="Dim window As JavaObject = jo.InitializeContext.R";
Debug.ShouldStop(4096);
_window = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_window = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"InitializeContext",main.processBA).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getWindow")),(Object)((parent.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("window", _window);
 BA.debugLineNum = 46;BA.debugLine="window.RunMethod(\"addFlags\", Array(Bit.Or(0x00000";
Debug.ShouldStop(8192);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 0x00000200)),(Object)(BA.numberCast(int.class, 0x08000000))))})));
 BA.debugLineNum = 47;BA.debugLine="Activity.Height = Activity.Height + 24dip";
Debug.ShouldStop(16384);
parent.mostCurrent._activity.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._activity.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "+",1, 1));
 BA.debugLineNum = 48;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(32768);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 49;BA.debugLine="general.SetBackgroundTintList(EditText1,Colors.Wh";
Debug.ShouldStop(65536);
parent.mostCurrent._general.runVoidMethod ("_setbackgroundtintlist" /*RemoteObject*/ ,main.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), parent.mostCurrent._edittext1.getObject()),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 50;BA.debugLine="general.SetBackgroundTintList(EditText2,Colors.Wh";
Debug.ShouldStop(131072);
parent.mostCurrent._general.runVoidMethod ("_setbackgroundtintlist" /*RemoteObject*/ ,main.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), parent.mostCurrent._edittext2.getObject()),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("activity_pause")) { return com.modis.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("activity_resume")) { return com.modis.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
if (RapidSub.canDelegate("button1_click")) { com.modis.main.remoteMe.runUserSub(false, "main","button1_click"); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(com.modis.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.modis.main parent;
RemoteObject _j = RemoteObject.declareNull("com.modis.httpjob");
RemoteObject _parameter = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _message = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _token = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 63;BA.debugLine="If EditText1.Text.Length>0 And EditText2.Text.Len";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._edittext1.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",parent.mostCurrent._edittext2.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 64;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(-2147483648);
_j = RemoteObject.createNew ("com.modis.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 66;BA.debugLine="Dim parameter As String =\"nik=\"&EditText1.Text&\"";
Debug.ShouldStop(2);
_parameter = RemoteObject.concat(RemoteObject.createImmutable("nik="),parent.mostCurrent._edittext1.runMethod(true,"getText"),RemoteObject.createImmutable("&password="),parent.mostCurrent._edittext2.runMethod(true,"getText"));Debug.locals.put("parameter", _parameter);Debug.locals.put("parameter", _parameter);
 BA.debugLineNum = 67;BA.debugLine="Log(parameter)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","8327686",_parameter,0);
 BA.debugLineNum = 68;BA.debugLine="j.Initialize(\"j\",Me)";
Debug.ShouldStop(8);
_j.runClassMethod (com.modis.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("j")),(Object)(main.getObject()));
 BA.debugLineNum = 69;BA.debugLine="j.PostString (url_login,parameter)";
Debug.ShouldStop(16);
_j.runClassMethod (com.modis.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(parent._url_login),(Object)(_parameter));
 BA.debugLineNum = 70;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "button1_click"), (_j));
this.state = 11;
return;
case 11:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 71;BA.debugLine="If j.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 4:
//if
this.state = 9;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 72;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","8327691",_j.runClassMethod (com.modis.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 73;BA.debugLine="Dim result As String = j.GetString";
Debug.ShouldStop(256);
_result = _j.runClassMethod (com.modis.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 74;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(512);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 75;BA.debugLine="parser.Initialize(result)";
Debug.ShouldStop(1024);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 76;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(2048);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 77;BA.debugLine="Dim message As String = root.Get(\"message\")";
Debug.ShouldStop(4096);
_message = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("message", _message);Debug.locals.put("message", _message);
 BA.debugLineNum = 78;BA.debugLine="Dim status As Int = root.Get(\"status\")";
Debug.ShouldStop(8192);
_status = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 79;BA.debugLine="Dim token As String = root.Get(\"token\")";
Debug.ShouldStop(16384);
_token = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token")))));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 80;BA.debugLine="StartActivity(Home)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._home.getObject())));
 BA.debugLineNum = 81;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 86;BA.debugLine="Log(j.ErrorMessage)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","8327705",_j.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 88;BA.debugLine="j.Release";
Debug.ShouldStop(8388608);
_j.runClassMethod (com.modis.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private EditText1 As EditText";
main.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EditText2 As EditText";
main.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Label6 As Label";
main.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _label6_click() throws Exception{
try {
		Debug.PushSubsStack("Label6_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("label6_click")) { return com.modis.main.remoteMe.runUserSub(false, "main","label6_click");}
 BA.debugLineNum = 92;BA.debugLine="Private Sub Label6_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="StartActivity(Register)";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._register.getObject())));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
general_subs_0._process_globals();
register_subs_0._process_globals();
home_subs_0._process_globals();
absensi_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.modis.main");
starter.myClass = BA.getDeviceClass ("com.modis.starter");
general.myClass = BA.getDeviceClass ("com.modis.general");
register.myClass = BA.getDeviceClass ("com.modis.register");
home.myClass = BA.getDeviceClass ("com.modis.home");
absensi.myClass = BA.getDeviceClass ("com.modis.absensi");
camex2.myClass = BA.getDeviceClass ("com.modis.camex2");
asradiobutton.myClass = BA.getDeviceClass ("com.modis.asradiobutton");
animatedcounter.myClass = BA.getDeviceClass ("com.modis.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("com.modis.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("com.modis.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("com.modis.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("com.modis.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("com.modis.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("com.modis.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("com.modis.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("com.modis.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("com.modis.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("com.modis.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("com.modis.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("com.modis.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("com.modis.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("com.modis.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("com.modis.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("com.modis.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("com.modis.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("com.modis.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("com.modis.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("com.modis.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("com.modis.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("com.modis.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("com.modis.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("com.modis.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("com.modis.xuiviewsutils");
b4xdrawer.myClass = BA.getDeviceClass ("com.modis.b4xdrawer");
httputils2service.myClass = BA.getDeviceClass ("com.modis.httputils2service");
httpjob.myClass = BA.getDeviceClass ("com.modis.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="Private rp As RuntimePermissions";
main._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 20;BA.debugLine="Private url_login As String =\"http://192.168.1.10";
main._url_login = BA.ObjectToString("http://192.168.1.10:3011/api/v2/modis/account/login");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}