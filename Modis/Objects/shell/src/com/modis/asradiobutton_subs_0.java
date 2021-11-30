package com.modis;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class asradiobutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "asradiobutton","base_resize", __ref, _width, _height);}
RemoteObject _clr_checked_background = RemoteObject.createImmutable(0);
RemoteObject _clr_unchecked_background = RemoteObject.createImmutable(0);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 104;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="xpnl_background.SetLayoutAnimated(0,0,0,Width,Hei";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 108;BA.debugLine="Dim clr_checked_background As Int = g_checked_bac";
Debug.JustUpdateDeviceLine();
_clr_checked_background = __ref.getField(true,"_g_checked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_checked_background", _clr_checked_background);Debug.locals.put("clr_checked_background", _clr_checked_background);
 BA.debugLineNum = 109;BA.debugLine="If g_enabled = False Then clr_checked_background";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_enabled" /*RemoteObject*/ ),asradiobutton.__c.getField(true,"False"))) { 
_clr_checked_background = __ref.getField(true,"_g_disabled_checked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_checked_background", _clr_checked_background);};
 BA.debugLineNum = 111;BA.debugLine="Dim clr_unchecked_background As Int = g_unchecked";
Debug.JustUpdateDeviceLine();
_clr_unchecked_background = __ref.getField(true,"_g_unchecked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);
 BA.debugLineNum = 112;BA.debugLine="If g_enabled = False Then clr_unchecked_backgroun";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_enabled" /*RemoteObject*/ ),asradiobutton.__c.getField(true,"False"))) { 
_clr_unchecked_background = __ref.getField(true,"_g_disabled_unchecked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);};
 BA.debugLineNum = 114;BA.debugLine="If g_checked = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_checked" /*RemoteObject*/ ),asradiobutton.__c.getField(true,"True"))) { 
 BA.debugLineNum = 115;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(true,"_g_border_width" /*RemoteObject*/ )),(Object)(_clr_checked_background),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))));
 }else {
 BA.debugLineNum = 117;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(true,"_g_border_width" /*RemoteObject*/ )),(Object)(_clr_unchecked_background),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))));
 };
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _check(RemoteObject __ref,RemoteObject _b_checked) throws Exception{
try {
		Debug.PushSubsStack("Check (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("check")) { __ref.runUserSub(false, "asradiobutton","check", __ref, _b_checked); return;}
ResumableSub_Check rsub = new ResumableSub_Check(null,__ref,_b_checked);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Check extends BA.ResumableSub {
public ResumableSub_Check(com.modis.asradiobutton parent,RemoteObject __ref,RemoteObject _b_checked) {
this.parent = parent;
this.__ref = __ref;
this._b_checked = _b_checked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.modis.asradiobutton parent;
RemoteObject _b_checked;
RemoteObject _clr_checked_background = RemoteObject.createImmutable(0);
RemoteObject _clr_unchecked_background = RemoteObject.createImmutable(0);
RemoteObject _animation_duration = RemoteObject.createImmutable(0);
RemoteObject _xview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xasrb = RemoteObject.declareNull("com.modis.asradiobutton");
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Check (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,134);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("b_checked", _b_checked);
 BA.debugLineNum = 136;BA.debugLine="Dim clr_checked_background As Int = g_checked_bac";
Debug.JustUpdateDeviceLine();
_clr_checked_background = __ref.getField(true,"_g_checked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_checked_background", _clr_checked_background);Debug.locals.put("clr_checked_background", _clr_checked_background);
 BA.debugLineNum = 137;BA.debugLine="If g_enabled = False Then clr_checked_background";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_enabled" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_clr_checked_background = __ref.getField(true,"_g_disabled_checked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_checked_background", _clr_checked_background);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 139;BA.debugLine="Dim clr_unchecked_background As Int = g_unchecked";
Debug.JustUpdateDeviceLine();
_clr_unchecked_background = __ref.getField(true,"_g_unchecked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);
 BA.debugLineNum = 140;BA.debugLine="If g_enabled = False Then clr_unchecked_backgroun";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_enabled" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_clr_unchecked_background = __ref.getField(true,"_g_disabled_unchecked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 142;BA.debugLine="Dim animation_duration As Int = 250";
Debug.JustUpdateDeviceLine();
_animation_duration = BA.numberCast(int.class, 250);Debug.locals.put("animation_duration", _animation_duration);Debug.locals.put("animation_duration", _animation_duration);
 BA.debugLineNum = 143;BA.debugLine="If g_Animation = \"NONE\" Then animation_duration =";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_animation" /*RemoteObject*/ ),BA.ObjectToString("NONE"))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_animation_duration = BA.numberCast(int.class, 0);Debug.locals.put("animation_duration", _animation_duration);
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 145;BA.debugLine="If b_checked Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 19:
//if
this.state = 60;
if (_b_checked.<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 48;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 147;BA.debugLine="For Each xview As B4XView In mBase.Parent.GetAll";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//for
this.state = 35;
_xview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
group8 = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(false,"GetAllViewsRecursive");
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("xview", _xview);
this.state = 61;
if (true) break;

case 61:
//C
this.state = 35;
if (index8 < groupLen8) {
this.state = 24;
_xview = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group8.runMethod(false,"Get",index8));}
if (true) break;

case 62:
//C
this.state = 61;
index8++;
Debug.locals.put("xview", _xview);
if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 148;BA.debugLine="If xview.Tag Is ASRadioButton And xview.Tag <>";
Debug.JustUpdateDeviceLine();
if (true) break;

case 25:
//if
this.state = 34;
if (RemoteObject.solveBoolean("i",_xview.runMethod(false,"getTag"), RemoteObject.createImmutable("com.modis.asradiobutton")) && RemoteObject.solveBoolean("!",_xview.runMethod(false,"getTag"),__ref)) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 149;BA.debugLine="Dim xasrb As ASRadioButton = xview.Tag";
Debug.JustUpdateDeviceLine();
_xasrb = (_xview.runMethod(false,"getTag"));Debug.locals.put("xasrb", _xasrb);Debug.locals.put("xasrb", _xasrb);
 BA.debugLineNum = 150;BA.debugLine="If xasrb.Checked = True Then xasrb.Checked = F";
Debug.JustUpdateDeviceLine();
if (true) break;

case 28:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_xasrb.runClassMethod (com.modis.asradiobutton.class, "_getchecked" /*RemoteObject*/ ),parent.__c.getField(true,"True"))) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
_xasrb.runClassMethod (com.modis.asradiobutton.class, "_setchecked" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = 62;
;
 if (true) break;
if (true) break;

case 35:
//C
this.state = 36;
Debug.locals.put("xview", _xview);
;
 BA.debugLineNum = 153;BA.debugLine="g_checked = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_checked" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 154;BA.debugLine="CheckedChange";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_checkedchange" /*RemoteObject*/ );
 BA.debugLineNum = 155;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(true,"_g_border_width" /*RemoteObject*/ )),(Object)(_clr_checked_background),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 156;BA.debugLine="xpnl_dot.SetLayoutAnimated(0,xpnl_background.Wid";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 157;BA.debugLine="xpnl_dot.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 159;BA.debugLine="If g_Animation = \"Slide\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 36:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_animation" /*RemoteObject*/ ),BA.ObjectToString("Slide"))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 161;BA.debugLine="xpnl_dot.SetLayoutAnimated(animation_duration,0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_animation_duration),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 162;BA.debugLine="xpnl_dot.SetColorAndBorder(clr_checked_backgroun";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_clr_checked_background),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 166;BA.debugLine="Sleep(animation_duration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asradiobutton", "check"),_animation_duration);
this.state = 63;
return;
case 63:
//C
this.state = 39;
;
 if (true) break;
;
 BA.debugLineNum = 170;BA.debugLine="If g_enabled = False Then clr_checked_background";
Debug.JustUpdateDeviceLine();

case 39:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_enabled" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 41;
;}
else {
this.state = 43;
;}if (true) break;

case 41:
//C
this.state = 46;
_clr_checked_background = __ref.getField(true,"_g_disabled_checked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_checked_background", _clr_checked_background);
if (true) break;

case 43:
//C
this.state = 46;
_clr_checked_background = __ref.getField(true,"_g_checked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_checked_background", _clr_checked_background);
if (true) break;

case 46:
//C
this.state = 60;
;
 BA.debugLineNum = 171;BA.debugLine="xpnl_dot.SetColorAndBorder(clr_checked_backgroun";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_clr_checked_background),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 173;BA.debugLine="xpnl_dot.SetLayoutAnimated(animation_duration,(x";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_animation_duration),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 185;BA.debugLine="CheckedChange";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_checkedchange" /*RemoteObject*/ );
 BA.debugLineNum = 186;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(true,"_g_border_width" /*RemoteObject*/ )),(Object)(_clr_unchecked_background),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 187;BA.debugLine="If g_Animation = \"Slide\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 49:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_animation" /*RemoteObject*/ ),BA.ObjectToString("Slide"))) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 189;BA.debugLine="xpnl_dot.SetColorAndBorder(clr_unchecked_backgro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_clr_unchecked_background),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 190;BA.debugLine="xpnl_dot.SetLayoutAnimated(animation_duration,0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_animation_duration),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 194;BA.debugLine="Sleep(animation_duration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asradiobutton", "check"),_animation_duration);
this.state = 64;
return;
case 64:
//C
this.state = 52;
;
 if (true) break;
;
 BA.debugLineNum = 196;BA.debugLine="If g_enabled = False Then clr_unchecked_backgrou";
Debug.JustUpdateDeviceLine();

case 52:
//if
this.state = 59;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_enabled" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 54;
;}
else {
this.state = 56;
;}if (true) break;

case 54:
//C
this.state = 59;
_clr_unchecked_background = __ref.getField(true,"_g_disabled_unchecked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);
if (true) break;

case 56:
//C
this.state = 59;
_clr_unchecked_background = __ref.getField(true,"_g_unchecked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);
if (true) break;

case 59:
//C
this.state = 60;
;
 BA.debugLineNum = 199;BA.debugLine="xpnl_dot.SetLayoutAnimated(animation_duration,mB";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_animation_duration),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 203;BA.debugLine="Sleep(animation_duration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "asradiobutton", "check"),_animation_duration);
this.state = 65;
return;
case 65:
//C
this.state = 60;
;
 BA.debugLineNum = 204;BA.debugLine="xpnl_dot.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;

case 60:
//C
this.state = -1;
;
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _checkedchange(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckedChange (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("checkedchange")) { return __ref.runUserSub(false, "asradiobutton","checkedchange", __ref);}
 BA.debugLineNum = 329;BA.debugLine="Private Sub CheckedChange";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 330;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Checked";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CheckedChange"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 331;BA.debugLine="CallSub2(mCallBack,mEventName & \"_CheckedChange\"";
Debug.JustUpdateDeviceLine();
asradiobutton.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CheckedChange"))),(Object)((__ref.getField(true,"_g_checked" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 33;BA.debugLine="Private mEventName As String 'ignore";
asradiobutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",asradiobutton._meventname);
 //BA.debugLineNum = 34;BA.debugLine="Private mCallBack As Object 'ignore";
asradiobutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",asradiobutton._mcallback);
 //BA.debugLineNum = 35;BA.debugLine="Public mBase As B4XView";
asradiobutton._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",asradiobutton._mbase);
 //BA.debugLineNum = 36;BA.debugLine="Private xui As XUI 'ignore";
asradiobutton._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",asradiobutton._xui);
 //BA.debugLineNum = 37;BA.debugLine="Public Tag As Object";
asradiobutton._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",asradiobutton._tag);
 //BA.debugLineNum = 39;BA.debugLine="Private xpnl_background As B4XView";
asradiobutton._xpnl_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_background",asradiobutton._xpnl_background);
 //BA.debugLineNum = 40;BA.debugLine="Private xpnl_dot As B4XView";
asradiobutton._xpnl_dot = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_dot",asradiobutton._xpnl_dot);
 //BA.debugLineNum = 42;BA.debugLine="Private g_checked_background_color As Int";
asradiobutton._g_checked_background_color = RemoteObject.createImmutable(0);__ref.setField("_g_checked_background_color",asradiobutton._g_checked_background_color);
 //BA.debugLineNum = 43;BA.debugLine="Private g_unchecked_background_color As Int";
asradiobutton._g_unchecked_background_color = RemoteObject.createImmutable(0);__ref.setField("_g_unchecked_background_color",asradiobutton._g_unchecked_background_color);
 //BA.debugLineNum = 45;BA.debugLine="Private g_disabled_checked_background_color As In";
asradiobutton._g_disabled_checked_background_color = RemoteObject.createImmutable(0);__ref.setField("_g_disabled_checked_background_color",asradiobutton._g_disabled_checked_background_color);
 //BA.debugLineNum = 46;BA.debugLine="Private g_disabled_unchecked_background_color As";
asradiobutton._g_disabled_unchecked_background_color = RemoteObject.createImmutable(0);__ref.setField("_g_disabled_unchecked_background_color",asradiobutton._g_disabled_unchecked_background_color);
 //BA.debugLineNum = 48;BA.debugLine="Private g_enabled As Boolean";
asradiobutton._g_enabled = RemoteObject.createImmutable(false);__ref.setField("_g_enabled",asradiobutton._g_enabled);
 //BA.debugLineNum = 50;BA.debugLine="Private g_checked As Boolean = False";
asradiobutton._g_checked = asradiobutton.__c.getField(true,"False");__ref.setField("_g_checked",asradiobutton._g_checked);
 //BA.debugLineNum = 51;BA.debugLine="Private g_border_width As Int";
asradiobutton._g_border_width = RemoteObject.createImmutable(0);__ref.setField("_g_border_width",asradiobutton._g_border_width);
 //BA.debugLineNum = 52;BA.debugLine="Private g_Animation As String";
asradiobutton._g_animation = RemoteObject.createImmutable("");__ref.setField("_g_animation",asradiobutton._g_animation);
 //BA.debugLineNum = 54;BA.debugLine="Public g_Haptic As Boolean";
asradiobutton._g_haptic = RemoteObject.createImmutable(false);__ref.setField("_g_haptic",asradiobutton._g_haptic);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "asradiobutton","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 68;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 70;BA.debugLine="Tag = mBase.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 71;BA.debugLine="mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 72;BA.debugLine="ini_props(Props)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_ini_props" /*RemoteObject*/ ,(Object)(_props));
 BA.debugLineNum = 74;BA.debugLine="xpnl_background = xui.CreatePanel(\"xpnl_backgroun";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_background"))));
 BA.debugLineNum = 75;BA.debugLine="xpnl_dot = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_dot" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 76;BA.debugLine="mBase.AddView(xpnl_background,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 77;BA.debugLine="xpnl_background.AddView(xpnl_dot,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 79;BA.debugLine="xpnl_background.Enabled = g_enabled";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"setEnabled",__ref.getField(true,"_g_enabled" /*RemoteObject*/ ));
 BA.debugLineNum = 81;BA.debugLine="UpdateStyle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_updatestyle" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBase (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "asradiobutton","getbase", __ref);}
 BA.debugLineNum = 130;BA.debugLine="Public Sub getBase As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getchecked(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getChecked (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("getchecked")) { return __ref.runUserSub(false, "asradiobutton","getchecked", __ref);}
 BA.debugLineNum = 126;BA.debugLine="Public Sub getChecked As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="Return g_checked";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_checked" /*RemoteObject*/ );
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdisabledcheckedbackgroundcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDisabledCheckedBackgroundColor (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,305);
if (RapidSub.canDelegate("getdisabledcheckedbackgroundcolor")) { return __ref.runUserSub(false, "asradiobutton","getdisabledcheckedbackgroundcolor", __ref);}
 BA.debugLineNum = 305;BA.debugLine="Public Sub getDisabledCheckedBackgroundColor As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 306;BA.debugLine="Return  g_disabled_checked_background_color";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_disabled_checked_background_color" /*RemoteObject*/ );
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdisableduncheckedbackgroundcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDisabledUncheckedBackgroundColor (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("getdisableduncheckedbackgroundcolor")) { return __ref.runUserSub(false, "asradiobutton","getdisableduncheckedbackgroundcolor", __ref);}
 BA.debugLineNum = 314;BA.debugLine="Public Sub getDisabledUncheckedBackgroundColor As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 315;BA.debugLine="Return  g_disabled_unchecked_background_color";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_disabled_unchecked_background_color" /*RemoteObject*/ );
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEnabled (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("getenabled")) { return __ref.runUserSub(false, "asradiobutton","getenabled", __ref);}
 BA.debugLineNum = 301;BA.debugLine="Public Sub getEnabled As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="Return g_enabled";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_enabled" /*RemoteObject*/ );
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ini_props(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("ini_props (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("ini_props")) { return __ref.runUserSub(false, "asradiobutton","ini_props", __ref, _props);}
Debug.locals.put("Props", _props);
 BA.debugLineNum = 89;BA.debugLine="Private Sub ini_props(Props As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="g_enabled = mBase.Enabled";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_enabled" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getEnabled"));
 BA.debugLineNum = 92;BA.debugLine="g_checked_background_color = xui.PaintOrColorToCo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_checked_background_color" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CheckedBackgroundColor")))))));
 BA.debugLineNum = 93;BA.debugLine="g_unchecked_background_color = xui.PaintOrColorTo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_unchecked_background_color" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UnCheckedBackgroundColor")))))));
 BA.debugLineNum = 95;BA.debugLine="g_disabled_checked_background_color = xui.PaintOr";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_disabled_checked_background_color" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DisabledCheckedBackgroundColor")))))));
 BA.debugLineNum = 96;BA.debugLine="g_disabled_unchecked_background_color = xui.Paint";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_disabled_unchecked_background_color" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DisabledUnCheckedBackgroundColor")))))));
 BA.debugLineNum = 98;BA.debugLine="g_border_width = Props.Get(\"BorderWidth\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_border_width" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BorderWidth"))))));
 BA.debugLineNum = 99;BA.debugLine="g_Animation = Props.GetDefault(\"Animation\",\"NONE\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_animation" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Animation"))),(Object)((RemoteObject.createImmutable("NONE"))))));
 BA.debugLineNum = 101;BA.debugLine="g_Haptic = Props.Get(\"HapticFeedback\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_haptic" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HapticFeedback"))))));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "asradiobutton","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 62;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 64;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborderwidth(RemoteObject __ref,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorderWidth (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("setborderwidth")) { return __ref.runUserSub(false, "asradiobutton","setborderwidth", __ref, _width);}
Debug.locals.put("width", _width);
 BA.debugLineNum = 279;BA.debugLine="Public Sub setBorderWidth(width As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 280;BA.debugLine="g_border_width = width";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_border_width" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 281;BA.debugLine="UpdateStyle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_updatestyle" /*RemoteObject*/ );
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setchecked(RemoteObject __ref,RemoteObject _b_checked) throws Exception{
try {
		Debug.PushSubsStack("setChecked (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setchecked")) { return __ref.runUserSub(false, "asradiobutton","setchecked", __ref, _b_checked);}
Debug.locals.put("b_checked", _b_checked);
 BA.debugLineNum = 121;BA.debugLine="Public Sub setChecked(b_checked As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="g_checked = b_checked";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_checked" /*RemoteObject*/ ,_b_checked);
 BA.debugLineNum = 123;BA.debugLine="Check(b_checked)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_check" /*void*/ ,(Object)(_b_checked));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcheckedbackgroundcolor(RemoteObject __ref,RemoteObject _crl) throws Exception{
try {
		Debug.PushSubsStack("setCheckedBackgroundColor (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,284);
if (RapidSub.canDelegate("setcheckedbackgroundcolor")) { return __ref.runUserSub(false, "asradiobutton","setcheckedbackgroundcolor", __ref, _crl);}
Debug.locals.put("crl", _crl);
 BA.debugLineNum = 284;BA.debugLine="Public Sub setCheckedBackgroundColor(crl As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 285;BA.debugLine="g_checked_background_color = crl";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_checked_background_color" /*RemoteObject*/ ,_crl);
 BA.debugLineNum = 286;BA.debugLine="UpdateStyle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_updatestyle" /*RemoteObject*/ );
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabledcheckedbackgroundcolor(RemoteObject __ref,RemoteObject _crl) throws Exception{
try {
		Debug.PushSubsStack("setDisabledCheckedBackgroundColor (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,309);
if (RapidSub.canDelegate("setdisabledcheckedbackgroundcolor")) { return __ref.runUserSub(false, "asradiobutton","setdisabledcheckedbackgroundcolor", __ref, _crl);}
Debug.locals.put("crl", _crl);
 BA.debugLineNum = 309;BA.debugLine="Public Sub setDisabledCheckedBackgroundColor(crl A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 310;BA.debugLine="g_disabled_checked_background_color = crl";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_disabled_checked_background_color" /*RemoteObject*/ ,_crl);
 BA.debugLineNum = 311;BA.debugLine="UpdateStyle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_updatestyle" /*RemoteObject*/ );
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisableduncheckedbackgroundcolor(RemoteObject __ref,RemoteObject _crl) throws Exception{
try {
		Debug.PushSubsStack("setDisabledUncheckedBackgroundColor (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("setdisableduncheckedbackgroundcolor")) { return __ref.runUserSub(false, "asradiobutton","setdisableduncheckedbackgroundcolor", __ref, _crl);}
Debug.locals.put("crl", _crl);
 BA.debugLineNum = 318;BA.debugLine="Public Sub setDisabledUncheckedBackgroundColor(crl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 319;BA.debugLine="g_disabled_unchecked_background_color = crl";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_disabled_unchecked_background_color" /*RemoteObject*/ ,_crl);
 BA.debugLineNum = 320;BA.debugLine="UpdateStyle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_updatestyle" /*RemoteObject*/ );
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenabled(RemoteObject __ref,RemoteObject _enable) throws Exception{
try {
		Debug.PushSubsStack("setEnabled (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,294);
if (RapidSub.canDelegate("setenabled")) { return __ref.runUserSub(false, "asradiobutton","setenabled", __ref, _enable);}
Debug.locals.put("enable", _enable);
 BA.debugLineNum = 294;BA.debugLine="Public Sub setEnabled(enable As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 295;BA.debugLine="g_enabled = enable";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_enabled" /*RemoteObject*/ ,_enable);
 BA.debugLineNum = 296;BA.debugLine="mBase.Enabled = enable";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 297;BA.debugLine="xpnl_background.Enabled = enable";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 298;BA.debugLine="UpdateStyle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_updatestyle" /*RemoteObject*/ );
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setuncheckedbackgroundcolor(RemoteObject __ref,RemoteObject _crl) throws Exception{
try {
		Debug.PushSubsStack("setUncheckedBackgroundColor (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("setuncheckedbackgroundcolor")) { return __ref.runUserSub(false, "asradiobutton","setuncheckedbackgroundcolor", __ref, _crl);}
Debug.locals.put("crl", _crl);
 BA.debugLineNum = 289;BA.debugLine="Public Sub setUncheckedBackgroundColor(crl As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 290;BA.debugLine="g_unchecked_background_color = crl";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_unchecked_background_color" /*RemoteObject*/ ,_crl);
 BA.debugLineNum = 291;BA.debugLine="UpdateStyle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_updatestyle" /*RemoteObject*/ );
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatestyle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateStyle (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,262);
if (RapidSub.canDelegate("updatestyle")) { return __ref.runUserSub(false, "asradiobutton","updatestyle", __ref);}
RemoteObject _clr_checked_background = RemoteObject.createImmutable(0);
RemoteObject _clr_unchecked_background = RemoteObject.createImmutable(0);
 BA.debugLineNum = 262;BA.debugLine="Private Sub UpdateStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 263;BA.debugLine="Dim clr_checked_background As Int = g_checked_bac";
Debug.JustUpdateDeviceLine();
_clr_checked_background = __ref.getField(true,"_g_checked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_checked_background", _clr_checked_background);Debug.locals.put("clr_checked_background", _clr_checked_background);
 BA.debugLineNum = 264;BA.debugLine="If g_enabled = False Then clr_checked_background";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_enabled" /*RemoteObject*/ ),asradiobutton.__c.getField(true,"False"))) { 
_clr_checked_background = __ref.getField(true,"_g_disabled_checked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_checked_background", _clr_checked_background);};
 BA.debugLineNum = 266;BA.debugLine="Dim clr_unchecked_background As Int = g_unchecked";
Debug.JustUpdateDeviceLine();
_clr_unchecked_background = __ref.getField(true,"_g_unchecked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);
 BA.debugLineNum = 267;BA.debugLine="If g_enabled = False Then clr_unchecked_backgroun";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_enabled" /*RemoteObject*/ ),asradiobutton.__c.getField(true,"False"))) { 
_clr_unchecked_background = __ref.getField(true,"_g_disabled_unchecked_background_color" /*RemoteObject*/ );Debug.locals.put("clr_unchecked_background", _clr_unchecked_background);};
 BA.debugLineNum = 269;BA.debugLine="If g_checked = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_checked" /*RemoteObject*/ ),asradiobutton.__c.getField(true,"True"))) { 
 BA.debugLineNum = 270;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(true,"_g_border_width" /*RemoteObject*/ )),(Object)(_clr_checked_background),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 271;BA.debugLine="xpnl_dot.SetColorAndBorder(clr_checked_backgroun";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_clr_checked_background),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 }else {
 BA.debugLineNum = 273;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(true,"_g_border_width" /*RemoteObject*/ )),(Object)(_clr_unchecked_background),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 274;BA.debugLine="xpnl_dot.SetColorAndBorder(clr_unchecked_backgro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_clr_unchecked_background),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_dot" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 };
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_background_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xpnl_background_Click (asradiobutton) ","asradiobutton",7,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("xpnl_background_click")) { return __ref.runUserSub(false, "asradiobutton","xpnl_background_click", __ref);}
 BA.debugLineNum = 251;BA.debugLine="Private Sub xpnl_background_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 252;BA.debugLine="If g_enabled = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_enabled" /*RemoteObject*/ ),asradiobutton.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 253;BA.debugLine="If g_Haptic Then XUIViewsUtils.PerformHapticFeedb";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_g_haptic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
asradiobutton._xuiviewsutils.runVoidMethod ("_performhapticfeedback" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));};
 BA.debugLineNum = 254;BA.debugLine="If g_checked = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_checked" /*RemoteObject*/ ),asradiobutton.__c.getField(true,"False"))) { 
 BA.debugLineNum = 255;BA.debugLine="setChecked(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.modis.asradiobutton.class, "_setchecked" /*RemoteObject*/ ,(Object)(asradiobutton.__c.getField(true,"True")));
 };
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}