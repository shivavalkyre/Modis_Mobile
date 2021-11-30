package com.modis;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class general_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbackgroundtintlist(RemoteObject _ba,RemoteObject _view,RemoteObject _active,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundTintList (general) ","general",2,_ba,general.mostCurrent,10);
if (RapidSub.canDelegate("setbackgroundtintlist")) { return com.modis.general.remoteMe.runUserSub(false, "general","setbackgroundtintlist", _ba, _view, _active, _enabled);}
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 10;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(1024);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 12;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(2048);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 13;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(4096);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 14;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(8192);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 15;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(16384);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 16;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(32768);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 17;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(65536);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 18;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(131072);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("androidx.core.view.ViewCompat")));
 BA.debugLineNum = 19;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(262144);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}