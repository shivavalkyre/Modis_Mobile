
package com.modis;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xcolortemplate {
    public static RemoteObject myClass;
	public b4xcolortemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xcolortemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _selectedalpha = RemoteObject.createImmutable(0);
public static RemoteObject _bccolors = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _selectedh = RemoteObject.createImmutable(0f);
public static RemoteObject _selecteds = RemoteObject.createImmutable(0f);
public static RemoteObject _selectedv = RemoteObject.createImmutable(0f);
public static RemoteObject _devicescale = RemoteObject.createImmutable(0f);
public static RemoteObject _colorscale = RemoteObject.createImmutable(0f);
public static RemoteObject _tempbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _dont_change = RemoteObject.createImmutable(0);
public static RemoteObject _huebar = RemoteObject.declareNull("com.modis.b4xcolortemplate._colorpickerpart");
public static RemoteObject _colorpicker = RemoteObject.declareNull("com.modis.b4xcolortemplate._colorpickerpart");
public static RemoteObject _alphabar = RemoteObject.declareNull("com.modis.b4xcolortemplate._colorpickerpart");
public static RemoteObject _borderscolor = RemoteObject.createImmutable(0);
public static RemoteObject _xdialog = RemoteObject.declareNull("com.modis.b4xdialog");
public static RemoteObject _initialcolor = null;
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.modis.main _main = null;
public static com.modis.starter _starter = null;
public static com.modis.general _general = null;
public static com.modis.register _register = null;
public static com.modis.home _home = null;
public static com.modis.absensi _absensi = null;
public static com.modis.xuiviewsutils _xuiviewsutils = null;
public static com.modis.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AlphaBar",_ref.getField(false, "_alphabar"),"bcColors",_ref.getField(false, "_bccolors"),"BordersColor",_ref.getField(false, "_borderscolor"),"ColorPicker",_ref.getField(false, "_colorpicker"),"ColorScale",_ref.getField(false, "_colorscale"),"DateUtils",_ref.getField(false, "_dateutils"),"DeviceScale",_ref.getField(false, "_devicescale"),"DONT_CHANGE",_ref.getField(false, "_dont_change"),"HueBar",_ref.getField(false, "_huebar"),"InitialColor",_ref.getField(false, "_initialcolor"),"mBase",_ref.getField(false, "_mbase"),"SelectedAlpha",_ref.getField(false, "_selectedalpha"),"selectedH",_ref.getField(false, "_selectedh"),"selectedS",_ref.getField(false, "_selecteds"),"selectedV",_ref.getField(false, "_selectedv"),"tempBC",_ref.getField(false, "_tempbc"),"xDialog",_ref.getField(false, "_xdialog"),"xui",_ref.getField(false, "_xui")};
}
}