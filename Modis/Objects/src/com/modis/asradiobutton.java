package com.modis;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class asradiobutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.modis.asradiobutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.modis.asradiobutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_dot = null;
public int _g_checked_background_color = 0;
public int _g_unchecked_background_color = 0;
public int _g_disabled_checked_background_color = 0;
public int _g_disabled_unchecked_background_color = 0;
public boolean _g_enabled = false;
public boolean _g_checked = false;
public int _g_border_width = 0;
public String _g_animation = "";
public boolean _g_haptic = false;
public b4a.example.dateutils _dateutils = null;
public com.modis.main _main = null;
public com.modis.starter _starter = null;
public com.modis.general _general = null;
public com.modis.register _register = null;
public com.modis.home _home = null;
public com.modis.absensi _absensi = null;
public com.modis.xuiviewsutils _xuiviewsutils = null;
public com.modis.httputils2service _httputils2service = null;
public String  _setchecked(com.modis.asradiobutton __ref,boolean _b_checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "setchecked", true))
	 {return ((String) Debug.delegate(ba, "setchecked", new Object[] {_b_checked}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub setChecked(b_checked As Boolean)";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="g_checked = b_checked";
__ref._g_checked /*boolean*/  = _b_checked;
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Check(b_checked)";
__ref._check /*void*/ (null,_b_checked);
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(com.modis.asradiobutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _clr_checked_background = 0;
int _clr_unchecked_background = 0;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="xpnl_background.SetLayoutAnimated(0,0,0,Width,Hei";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Dim clr_checked_background As Int = g_checked_bac";
_clr_checked_background = __ref._g_checked_background_color /*int*/ ;
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="If g_enabled = False Then clr_checked_background";
if (__ref._g_enabled /*boolean*/ ==__c.False) { 
_clr_checked_background = __ref._g_disabled_checked_background_color /*int*/ ;};
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="Dim clr_unchecked_background As Int = g_unchecked";
_clr_unchecked_background = __ref._g_unchecked_background_color /*int*/ ;
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="If g_enabled = False Then clr_unchecked_backgroun";
if (__ref._g_enabled /*boolean*/ ==__c.False) { 
_clr_unchecked_background = __ref._g_disabled_unchecked_background_color /*int*/ ;};
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="If g_checked = True Then";
if (__ref._g_checked /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._g_border_width /*int*/ ,_clr_checked_background,(int) (_height/(double)2));
 }else {
RDebugUtils.currentLine=7012365;
 //BA.debugLineNum = 7012365;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._g_border_width /*int*/ ,_clr_unchecked_background,(int) (_height/(double)2));
 };
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="End Sub";
return "";
}
public void  _check(com.modis.asradiobutton __ref,boolean _b_checked) throws Exception{
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "check", true))
	 {Debug.delegate(ba, "check", new Object[] {_b_checked}); return;}
ResumableSub_Check rsub = new ResumableSub_Check(this,__ref,_b_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_Check extends BA.ResumableSub {
public ResumableSub_Check(com.modis.asradiobutton parent,com.modis.asradiobutton __ref,boolean _b_checked) {
this.parent = parent;
this.__ref = __ref;
this._b_checked = _b_checked;
this.__ref = parent;
}
com.modis.asradiobutton __ref;
com.modis.asradiobutton parent;
boolean _b_checked;
int _clr_checked_background = 0;
int _clr_unchecked_background = 0;
int _animation_duration = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xview = null;
com.modis.asradiobutton _xasrb = null;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="asradiobutton";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim clr_checked_background As Int = g_checked_bac";
_clr_checked_background = __ref._g_checked_background_color /*int*/ ;
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="If g_enabled = False Then clr_checked_background";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._g_enabled /*boolean*/ ==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_clr_checked_background = __ref._g_disabled_checked_background_color /*int*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="Dim clr_unchecked_background As Int = g_unchecked";
_clr_unchecked_background = __ref._g_unchecked_background_color /*int*/ ;
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="If g_enabled = False Then clr_unchecked_backgroun";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._g_enabled /*boolean*/ ==parent.__c.False) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_clr_unchecked_background = __ref._g_disabled_unchecked_background_color /*int*/ ;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="Dim animation_duration As Int = 250";
_animation_duration = (int) (250);
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="If g_Animation = \"NONE\" Then animation_duration =";
if (true) break;

case 13:
//if
this.state = 18;
if ((__ref._g_animation /*String*/ ).equals("NONE")) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_animation_duration = (int) (0);
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="If b_checked Then";
if (true) break;

case 19:
//if
this.state = 60;
if (_b_checked) { 
this.state = 21;
}else {
this.state = 48;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="For Each xview As B4XView In mBase.Parent.GetAll";
if (true) break;

case 22:
//for
this.state = 35;
_xview = new anywheresoftware.b4a.objects.B4XViewWrapper();
group8 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
index8 = 0;
groupLen8 = group8.getSize();
this.state = 61;
if (true) break;

case 61:
//C
this.state = 35;
if (index8 < groupLen8) {
this.state = 24;
_xview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group8.Get(index8)));}
if (true) break;

case 62:
//C
this.state = 61;
index8++;
if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=7274510;
 //BA.debugLineNum = 7274510;BA.debugLine="If xview.Tag Is ASRadioButton And xview.Tag <>";
if (true) break;

case 25:
//if
this.state = 34;
if (_xview.getTag() instanceof com.modis.asradiobutton && (_xview.getTag()).equals(parent) == false) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="Dim xasrb As ASRadioButton = xview.Tag";
_xasrb = (com.modis.asradiobutton)(_xview.getTag());
RDebugUtils.currentLine=7274512;
 //BA.debugLineNum = 7274512;BA.debugLine="If xasrb.Checked = True Then xasrb.Checked = F";
if (true) break;

case 28:
//if
this.state = 33;
if (_xasrb._getchecked /*boolean*/ (null)==parent.__c.True) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
_xasrb._setchecked /*boolean*/ (null,parent.__c.False);
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
;
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="g_checked = True";
__ref._g_checked /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="CheckedChange";
__ref._checkedchange /*String*/ (null);
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._g_border_width /*int*/ ,_clr_checked_background,(int) (__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=7274518;
 //BA.debugLineNum = 7274518;BA.debugLine="xpnl_dot.SetLayoutAnimated(0,xpnl_background.Wid";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-parent.__c.DipToCurrent((int) (1))/(double)2),(int) (__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-parent.__c.DipToCurrent((int) (1))/(double)2),parent.__c.DipToCurrent((int) (1)),parent.__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="xpnl_dot.Visible = True";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=7274521;
 //BA.debugLineNum = 7274521;BA.debugLine="If g_Animation = \"Slide\" Then";
if (true) break;

case 36:
//if
this.state = 39;
if ((__ref._g_animation /*String*/ ).equals("Slide")) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=7274523;
 //BA.debugLineNum = 7274523;BA.debugLine="xpnl_dot.SetLayoutAnimated(animation_duration,0,";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_animation_duration,(int) (0),(int) (0),__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=7274524;
 //BA.debugLineNum = 7274524;BA.debugLine="xpnl_dot.SetColorAndBorder(clr_checked_backgroun";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_clr_checked_background,(int) (0),(int) (0),(int) (__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=7274528;
 //BA.debugLineNum = 7274528;BA.debugLine="Sleep(animation_duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asradiobutton", "check"),_animation_duration);
this.state = 63;
return;
case 63:
//C
this.state = 39;
;
 if (true) break;
;
RDebugUtils.currentLine=7274532;
 //BA.debugLineNum = 7274532;BA.debugLine="If g_enabled = False Then clr_checked_background";

case 39:
//if
this.state = 46;
if (__ref._g_enabled /*boolean*/ ==parent.__c.False) { 
this.state = 41;
;}
else {
this.state = 43;
;}if (true) break;

case 41:
//C
this.state = 46;
_clr_checked_background = __ref._g_disabled_checked_background_color /*int*/ ;
if (true) break;

case 43:
//C
this.state = 46;
_clr_checked_background = __ref._g_checked_background_color /*int*/ ;
if (true) break;

case 46:
//C
this.state = 60;
;
RDebugUtils.currentLine=7274533;
 //BA.debugLineNum = 7274533;BA.debugLine="xpnl_dot.SetColorAndBorder(clr_checked_backgroun";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_clr_checked_background,(int) (0),(int) (0),(int) ((__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)/(double)2));
RDebugUtils.currentLine=7274535;
 //BA.debugLineNum = 7274535;BA.debugLine="xpnl_dot.SetLayoutAnimated(animation_duration,(x";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_animation_duration,(int) ((__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-(__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2))/(double)2),(int) ((__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-(__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2))/(double)2),(int) (__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),(int) (__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=7274547;
 //BA.debugLineNum = 7274547;BA.debugLine="CheckedChange";
__ref._checkedchange /*String*/ (null);
RDebugUtils.currentLine=7274548;
 //BA.debugLineNum = 7274548;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._g_border_width /*int*/ ,_clr_unchecked_background,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=7274549;
 //BA.debugLineNum = 7274549;BA.debugLine="If g_Animation = \"Slide\" Then";
if (true) break;

case 49:
//if
this.state = 52;
if ((__ref._g_animation /*String*/ ).equals("Slide")) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=7274551;
 //BA.debugLineNum = 7274551;BA.debugLine="xpnl_dot.SetColorAndBorder(clr_unchecked_backgro";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_clr_unchecked_background,(int) (0),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=7274552;
 //BA.debugLineNum = 7274552;BA.debugLine="xpnl_dot.SetLayoutAnimated(animation_duration,0,";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_animation_duration,(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=7274556;
 //BA.debugLineNum = 7274556;BA.debugLine="Sleep(animation_duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asradiobutton", "check"),_animation_duration);
this.state = 64;
return;
case 64:
//C
this.state = 52;
;
 if (true) break;
;
RDebugUtils.currentLine=7274558;
 //BA.debugLineNum = 7274558;BA.debugLine="If g_enabled = False Then clr_unchecked_backgrou";

case 52:
//if
this.state = 59;
if (__ref._g_enabled /*boolean*/ ==parent.__c.False) { 
this.state = 54;
;}
else {
this.state = 56;
;}if (true) break;

case 54:
//C
this.state = 59;
_clr_unchecked_background = __ref._g_disabled_unchecked_background_color /*int*/ ;
if (true) break;

case 56:
//C
this.state = 59;
_clr_unchecked_background = __ref._g_unchecked_background_color /*int*/ ;
if (true) break;

case 59:
//C
this.state = 60;
;
RDebugUtils.currentLine=7274561;
 //BA.debugLineNum = 7274561;BA.debugLine="xpnl_dot.SetLayoutAnimated(animation_duration,mB";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_animation_duration,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-parent.__c.DipToCurrent((int) (1))/(double)2),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-parent.__c.DipToCurrent((int) (1))/(double)2),parent.__c.DipToCurrent((int) (1)),parent.__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=7274565;
 //BA.debugLineNum = 7274565;BA.debugLine="Sleep(animation_duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asradiobutton", "check"),_animation_duration);
this.state = 65;
return;
case 65:
//C
this.state = 60;
;
RDebugUtils.currentLine=7274566;
 //BA.debugLineNum = 7274566;BA.debugLine="xpnl_dot.Visible = False";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
 if (true) break;

case 60:
//C
this.state = -1;
;
RDebugUtils.currentLine=7274570;
 //BA.debugLineNum = 7274570;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _getchecked(com.modis.asradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "getchecked", true))
	 {return ((Boolean) Debug.delegate(ba, "getchecked", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub getChecked As Boolean";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Return g_checked";
if (true) return __ref._g_checked /*boolean*/ ;
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return false;
}
public String  _checkedchange(com.modis.asradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "checkedchange", true))
	 {return ((String) Debug.delegate(ba, "checkedchange", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Private Sub CheckedChange";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Checked";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CheckedChange",(int) (1))) { 
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="CallSub2(mCallBack,mEventName & \"_CheckedChange\"";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CheckedChange",(Object)(__ref._g_checked /*boolean*/ ));
 };
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.modis.asradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="Private xpnl_background As B4XView";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="Private xpnl_dot As B4XView";
_xpnl_dot = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="Private g_checked_background_color As Int";
_g_checked_background_color = 0;
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="Private g_unchecked_background_color As Int";
_g_unchecked_background_color = 0;
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="Private g_disabled_checked_background_color As In";
_g_disabled_checked_background_color = 0;
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="Private g_disabled_unchecked_background_color As";
_g_disabled_unchecked_background_color = 0;
RDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="Private g_enabled As Boolean";
_g_enabled = false;
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="Private g_checked As Boolean = False";
_g_checked = __c.False;
RDebugUtils.currentLine=6750227;
 //BA.debugLineNum = 6750227;BA.debugLine="Private g_border_width As Int";
_g_border_width = 0;
RDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="Private g_Animation As String";
_g_animation = "";
RDebugUtils.currentLine=6750230;
 //BA.debugLineNum = 6750230;BA.debugLine="Public g_Haptic As Boolean";
_g_haptic = false;
RDebugUtils.currentLine=6750236;
 //BA.debugLineNum = 6750236;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(com.modis.asradiobutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="ini_props(Props)";
__ref._ini_props /*String*/ (null,_props);
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="xpnl_background = xui.CreatePanel(\"xpnl_backgroun";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_background");
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="xpnl_dot = xui.CreatePanel(\"\")";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="mBase.AddView(xpnl_background,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="xpnl_background.AddView(xpnl_dot,0,0,0,0)";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="xpnl_background.Enabled = g_enabled";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._g_enabled /*boolean*/ );
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="UpdateStyle";
__ref._updatestyle /*String*/ (null);
RDebugUtils.currentLine=6881296;
 //BA.debugLineNum = 6881296;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=6881299;
 //BA.debugLineNum = 6881299;BA.debugLine="End Sub";
return "";
}
public String  _ini_props(com.modis.asradiobutton __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "ini_props", true))
	 {return ((String) Debug.delegate(ba, "ini_props", new Object[] {_props}));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub ini_props(Props As Map)";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="g_enabled = mBase.Enabled";
__ref._g_enabled /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="g_checked_background_color = xui.PaintOrColorToCo";
__ref._g_checked_background_color /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CheckedBackgroundColor")));
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="g_unchecked_background_color = xui.PaintOrColorTo";
__ref._g_unchecked_background_color /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("UnCheckedBackgroundColor")));
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="g_disabled_checked_background_color = xui.PaintOr";
__ref._g_disabled_checked_background_color /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("DisabledCheckedBackgroundColor")));
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="g_disabled_unchecked_background_color = xui.Paint";
__ref._g_disabled_unchecked_background_color /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("DisabledUnCheckedBackgroundColor")));
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="g_border_width = Props.Get(\"BorderWidth\")";
__ref._g_border_width /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("BorderWidth"))));
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="g_Animation = Props.GetDefault(\"Animation\",\"NONE\"";
__ref._g_animation /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("Animation"),(Object)("NONE")));
RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="g_Haptic = Props.Get(\"HapticFeedback\")";
__ref._g_haptic /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("HapticFeedback")));
RDebugUtils.currentLine=6946829;
 //BA.debugLineNum = 6946829;BA.debugLine="End Sub";
return "";
}
public String  _updatestyle(com.modis.asradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "updatestyle", true))
	 {return ((String) Debug.delegate(ba, "updatestyle", null));}
int _clr_checked_background = 0;
int _clr_unchecked_background = 0;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub UpdateStyle";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Dim clr_checked_background As Int = g_checked_bac";
_clr_checked_background = __ref._g_checked_background_color /*int*/ ;
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="If g_enabled = False Then clr_checked_background";
if (__ref._g_enabled /*boolean*/ ==__c.False) { 
_clr_checked_background = __ref._g_disabled_checked_background_color /*int*/ ;};
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="Dim clr_unchecked_background As Int = g_unchecked";
_clr_unchecked_background = __ref._g_unchecked_background_color /*int*/ ;
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="If g_enabled = False Then clr_unchecked_backgroun";
if (__ref._g_enabled /*boolean*/ ==__c.False) { 
_clr_unchecked_background = __ref._g_disabled_unchecked_background_color /*int*/ ;};
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="If g_checked = True Then";
if (__ref._g_checked /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._g_border_width /*int*/ ,_clr_checked_background,(int) (__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="xpnl_dot.SetColorAndBorder(clr_checked_backgroun";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_clr_checked_background,(int) (0),(int) (0),(int) (__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
 }else {
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="xpnl_background.SetColorAndBorder(xui.Color_Tran";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._g_border_width /*int*/ ,_clr_unchecked_background,(int) (__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="xpnl_dot.SetColorAndBorder(clr_unchecked_backgro";
__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_clr_unchecked_background,(int) (0),(int) (0),(int) (__ref._xpnl_dot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
 };
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(com.modis.asradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "getbase", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub getBase As B4XView";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return null;
}
public int  _getdisabledcheckedbackgroundcolor(com.modis.asradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "getdisabledcheckedbackgroundcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getdisabledcheckedbackgroundcolor", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub getDisabledCheckedBackgroundColor As In";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Return  g_disabled_checked_background_color";
if (true) return __ref._g_disabled_checked_background_color /*int*/ ;
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return 0;
}
public int  _getdisableduncheckedbackgroundcolor(com.modis.asradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "getdisableduncheckedbackgroundcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getdisableduncheckedbackgroundcolor", null));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub getDisabledUncheckedBackgroundColor As";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Return  g_disabled_unchecked_background_color";
if (true) return __ref._g_disabled_unchecked_background_color /*int*/ ;
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="End Sub";
return 0;
}
public boolean  _getenabled(com.modis.asradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Return g_enabled";
if (true) return __ref._g_enabled /*boolean*/ ;
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return false;
}
public String  _initialize(com.modis.asradiobutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
return "";
}
public String  _setborderwidth(com.modis.asradiobutton __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "setborderwidth", true))
	 {return ((String) Debug.delegate(ba, "setborderwidth", new Object[] {_width}));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub setBorderWidth(width As Int)";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="g_border_width = width";
__ref._g_border_width /*int*/  = _width;
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="UpdateStyle";
__ref._updatestyle /*String*/ (null);
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedbackgroundcolor(com.modis.asradiobutton __ref,int _crl) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "setcheckedbackgroundcolor", true))
	 {return ((String) Debug.delegate(ba, "setcheckedbackgroundcolor", new Object[] {_crl}));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub setCheckedBackgroundColor(crl As Int)";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="g_checked_background_color = crl";
__ref._g_checked_background_color /*int*/  = _crl;
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="UpdateStyle";
__ref._updatestyle /*String*/ (null);
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="End Sub";
return "";
}
public String  _setdisabledcheckedbackgroundcolor(com.modis.asradiobutton __ref,int _crl) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "setdisabledcheckedbackgroundcolor", true))
	 {return ((String) Debug.delegate(ba, "setdisabledcheckedbackgroundcolor", new Object[] {_crl}));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub setDisabledCheckedBackgroundColor(crl A";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="g_disabled_checked_background_color = crl";
__ref._g_disabled_checked_background_color /*int*/  = _crl;
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="UpdateStyle";
__ref._updatestyle /*String*/ (null);
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="End Sub";
return "";
}
public String  _setdisableduncheckedbackgroundcolor(com.modis.asradiobutton __ref,int _crl) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "setdisableduncheckedbackgroundcolor", true))
	 {return ((String) Debug.delegate(ba, "setdisableduncheckedbackgroundcolor", new Object[] {_crl}));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub setDisabledUncheckedBackgroundColor(crl";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="g_disabled_unchecked_background_color = crl";
__ref._g_disabled_unchecked_background_color /*int*/  = _crl;
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="UpdateStyle";
__ref._updatestyle /*String*/ (null);
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(com.modis.asradiobutton __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_enable}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub setEnabled(enable As Boolean)";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="g_enabled = enable";
__ref._g_enabled /*boolean*/  = _enable;
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="mBase.Enabled = enable";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="xpnl_background.Enabled = enable";
__ref._xpnl_background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="UpdateStyle";
__ref._updatestyle /*String*/ (null);
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="End Sub";
return "";
}
public String  _setuncheckedbackgroundcolor(com.modis.asradiobutton __ref,int _crl) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "setuncheckedbackgroundcolor", true))
	 {return ((String) Debug.delegate(ba, "setuncheckedbackgroundcolor", new Object[] {_crl}));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub setUncheckedBackgroundColor(crl As Int)";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="g_unchecked_background_color = crl";
__ref._g_unchecked_background_color /*int*/  = _crl;
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="UpdateStyle";
__ref._updatestyle /*String*/ (null);
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_background_click(com.modis.asradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asradiobutton";
if (Debug.shouldDelegate(ba, "xpnl_background_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_background_click", null));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub xpnl_background_Click";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="If g_enabled = False Then Return";
if (__ref._g_enabled /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="If g_Haptic Then XUIViewsUtils.PerformHapticFeedb";
if (__ref._g_haptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="If g_checked = False Then";
if (__ref._g_checked /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="setChecked(True)";
__ref._setchecked /*String*/ (null,__c.True);
 };
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="End Sub";
return "";
}
}