package com.modis;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class general {
private static general mostCurrent = new general();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public com.modis.main _main = null;
public com.modis.starter _starter = null;
public com.modis.register _register = null;
public com.modis.home _home = null;
public com.modis.absensi _absensi = null;
public com.modis.xuiviewsutils _xuiviewsutils = null;
public com.modis.httputils2service _httputils2service = null;
public static String  _setbackgroundtintlist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
RDebugUtils.currentModule="general";
if (Debug.shouldDelegate(null, "setbackgroundtintlist", false))
	 {return ((String) Debug.delegate(null, "setbackgroundtintlist", new Object[] {_ba,_view,_active,_enabled}));}
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("androidx.core.view.ViewCompat");
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="End Sub";
return "";
}
}