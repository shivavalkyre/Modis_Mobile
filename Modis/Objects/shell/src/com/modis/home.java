
package com.modis;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class home implements IRemote{
	public static home mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public home() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("home"), "com.modis.home");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, home.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _drawer = RemoteObject.declareNull("com.modis.b4xdrawer");
public static RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label14 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _asradiobutton1 = RemoteObject.declareNull("com.modis.asradiobutton");
public static RemoteObject _asradiobutton2 = RemoteObject.declareNull("com.modis.asradiobutton");
public static RemoteObject _asradiobutton3 = RemoteObject.declareNull("com.modis.asradiobutton");
public static RemoteObject _asradiobutton5 = RemoteObject.declareNull("com.modis.asradiobutton");
public static RemoteObject _asradiobutton4 = RemoteObject.declareNull("com.modis.asradiobutton");
public static RemoteObject _label16 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel12 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label19 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label20 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imageview4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelclosesidebar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _clvsidebar = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _lblisisidebar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imageviewsidebar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.modis.main _main = null;
public static com.modis.starter _starter = null;
public static com.modis.general _general = null;
public static com.modis.register _register = null;
public static com.modis.absensi _absensi = null;
public static com.modis.xuiviewsutils _xuiviewsutils = null;
public static com.modis.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Absensi",Debug.moduleToString(com.modis.absensi.class),"Activity",home.mostCurrent._activity,"ASRadioButton1",home.mostCurrent._asradiobutton1,"ASRadioButton2",home.mostCurrent._asradiobutton2,"ASRadioButton3",home.mostCurrent._asradiobutton3,"ASRadioButton4",home.mostCurrent._asradiobutton4,"ASRadioButton5",home.mostCurrent._asradiobutton5,"CLVSidebar",home.mostCurrent._clvsidebar,"DateUtils",home.mostCurrent._dateutils,"Drawer",home.mostCurrent._drawer,"general",Debug.moduleToString(com.modis.general.class),"HttpUtils2Service",Debug.moduleToString(com.modis.httputils2service.class),"ImageView4",home.mostCurrent._imageview4,"ImageView5",home.mostCurrent._imageview5,"ImageViewSidebar",home.mostCurrent._imageviewsidebar,"Label14",home.mostCurrent._label14,"Label16",home.mostCurrent._label16,"Label19",home.mostCurrent._label19,"Label2",home.mostCurrent._label2,"Label20",home.mostCurrent._label20,"Label6",home.mostCurrent._label6,"Label7",home.mostCurrent._label7,"Label8",home.mostCurrent._label8,"LabelCloseSidebar",home.mostCurrent._labelclosesidebar,"LblisiSidebar",home.mostCurrent._lblisisidebar,"Main",Debug.moduleToString(com.modis.main.class),"Panel1",home.mostCurrent._panel1,"Panel12",home.mostCurrent._panel12,"Panel3",home.mostCurrent._panel3,"Register",Debug.moduleToString(com.modis.register.class),"Starter",Debug.moduleToString(com.modis.starter.class),"XUIViewsUtils",Debug.moduleToString(com.modis.xuiviewsutils.class)};
}
}