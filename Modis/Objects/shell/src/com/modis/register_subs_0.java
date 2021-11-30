package com.modis;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class register_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (register) ","register",3,register.mostCurrent.activityBA,register.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return com.modis.register.remoteMe.runUserSub(false, "register","activity_create", _firsttime);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _window = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(268435456);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 30;BA.debugLine="Dim window As JavaObject = jo.InitializeContext.R";
Debug.ShouldStop(536870912);
_window = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_window = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"InitializeContext",register.processBA).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getWindow")),(Object)((register.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("window", _window);
 BA.debugLineNum = 31;BA.debugLine="window.RunMethod(\"addFlags\", Array(Bit.Or(0x00000";
Debug.ShouldStop(1073741824);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(register.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 0x00000200)),(Object)(BA.numberCast(int.class, 0x08000000))))})));
 BA.debugLineNum = 32;BA.debugLine="Activity.Height = Activity.Height + 24dip";
Debug.ShouldStop(-2147483648);
register.mostCurrent._activity.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {register.mostCurrent._activity.runMethod(true,"getHeight"),register.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "+",1, 1));
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"Register\")";
Debug.ShouldStop(1);
register.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Register")),register.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="general.SetBackgroundTintList(EditText1,Colors.Wh";
Debug.ShouldStop(4);
register.mostCurrent._general.runVoidMethod ("_setbackgroundtintlist" /*RemoteObject*/ ,register.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), register.mostCurrent._edittext1.getObject()),(Object)(register.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 36;BA.debugLine="general.SetBackgroundTintList(EditText2,Colors.Wh";
Debug.ShouldStop(8);
register.mostCurrent._general.runVoidMethod ("_setbackgroundtintlist" /*RemoteObject*/ ,register.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), register.mostCurrent._edittext2.getObject()),(Object)(register.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 37;BA.debugLine="general.SetBackgroundTintList(EditText3,Colors.Wh";
Debug.ShouldStop(16);
register.mostCurrent._general.runVoidMethod ("_setbackgroundtintlist" /*RemoteObject*/ ,register.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), register.mostCurrent._edittext3.getObject()),(Object)(register.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 38;BA.debugLine="general.SetBackgroundTintList(EditText4,Colors.Wh";
Debug.ShouldStop(32);
register.mostCurrent._general.runVoidMethod ("_setbackgroundtintlist" /*RemoteObject*/ ,register.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), register.mostCurrent._edittext4.getObject()),(Object)(register.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (register) ","register",3,register.mostCurrent.activityBA,register.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) { return com.modis.register.remoteMe.runUserSub(false, "register","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (register) ","register",3,register.mostCurrent.activityBA,register.mostCurrent,41);
if (RapidSub.canDelegate("activity_resume")) { return com.modis.register.remoteMe.runUserSub(false, "register","activity_resume");}
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (register) ","register",3,register.mostCurrent.activityBA,register.mostCurrent,55);
if (RapidSub.canDelegate("button1_click")) { return com.modis.register.remoteMe.runUserSub(false, "register","button1_click");}
 BA.debugLineNum = 55;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="PanelMessage.SetVisibleAnimated(200,True)";
Debug.ShouldStop(8388608);
register.mostCurrent._panelmessage.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(register.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (register) ","register",3,register.mostCurrent.activityBA,register.mostCurrent,59);
if (RapidSub.canDelegate("button2_click")) { return com.modis.register.remoteMe.runUserSub(false, "register","button2_click");}
 BA.debugLineNum = 59;BA.debugLine="Private Sub Button2_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="PanelMessage.SetVisibleAnimated(200,False)";
Debug.ShouldStop(134217728);
register.mostCurrent._panelmessage.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(register.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private EditText1 As EditText";
register.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditText2 As EditText";
register.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private EditText3 As EditText";
register.mostCurrent._edittext3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private EditText4 As EditText";
register.mostCurrent._edittext4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label7 As Label";
register.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Button1 As Button";
register.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelMessage As Panel";
register.mostCurrent._panelmessage = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Button2 As Button";
register.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Label10 As Label";
register.mostCurrent._label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _label10_click() throws Exception{
try {
		Debug.PushSubsStack("Label10_Click (register) ","register",3,register.mostCurrent.activityBA,register.mostCurrent,63);
if (RapidSub.canDelegate("label10_click")) { return com.modis.register.remoteMe.runUserSub(false, "register","label10_click");}
 BA.debugLineNum = 63;BA.debugLine="Private Sub Label10_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="PanelMessage.SetVisibleAnimated(200,False)";
Debug.ShouldStop(-2147483648);
register.mostCurrent._panelmessage.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(register.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label7_click() throws Exception{
try {
		Debug.PushSubsStack("Label7_Click (register) ","register",3,register.mostCurrent.activityBA,register.mostCurrent,50);
if (RapidSub.canDelegate("label7_click")) { return com.modis.register.remoteMe.runUserSub(false, "register","label7_click");}
 BA.debugLineNum = 50;BA.debugLine="Private Sub Label7_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(262144);
register.mostCurrent.__c.runVoidMethod ("StartActivity",register.processBA,(Object)((register.mostCurrent._main.getObject())));
 BA.debugLineNum = 52;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
register.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelmessage_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PanelMessage_Touch (register) ","register",3,register.mostCurrent.activityBA,register.mostCurrent,67);
if (RapidSub.canDelegate("panelmessage_touch")) { return com.modis.register.remoteMe.runUserSub(false, "register","panelmessage_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 67;BA.debugLine="Private Sub PanelMessage_Touch (Action As Int, X A";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}