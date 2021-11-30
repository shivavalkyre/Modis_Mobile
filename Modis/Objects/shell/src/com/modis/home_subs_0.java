package com.modis;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class home_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,43);
if (RapidSub.canDelegate("activity_create")) { return com.modis.home.remoteMe.runUserSub(false, "home","activity_create", _firsttime);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _window = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(4096);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 46;BA.debugLine="Dim window As JavaObject = jo.InitializeContext.R";
Debug.ShouldStop(8192);
_window = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_window = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"InitializeContext",home.processBA).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getWindow")),(Object)((home.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("window", _window);
 BA.debugLineNum = 47;BA.debugLine="window.RunMethod(\"addFlags\", Array(Bit.Or(0x00000";
Debug.ShouldStop(16384);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(home.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 0x00000200)),(Object)(BA.numberCast(int.class, 0x08000000))))})));
 BA.debugLineNum = 48;BA.debugLine="Activity.Height = Activity.Height + 24dip";
Debug.ShouldStop(32768);
home.mostCurrent._activity.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {home.mostCurrent._activity.runMethod(true,"getHeight"),home.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "+",1, 1));
 BA.debugLineNum = 49;BA.debugLine="Drawer.Initialize(Me, \"Drawer\", Activity, 280dip)";
Debug.ShouldStop(65536);
home.mostCurrent._drawer.runClassMethod (com.modis.b4xdrawer.class, "_initialize" /*RemoteObject*/ ,home.mostCurrent.activityBA,(Object)(home.getObject()),(Object)(BA.ObjectToString("Drawer")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), home.mostCurrent._activity.getObject()),(Object)(home.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))));
 BA.debugLineNum = 50;BA.debugLine="Drawer.CenterPanel.LoadLayout(\"Home\")";
Debug.ShouldStop(131072);
home.mostCurrent._drawer.runClassMethod (com.modis.b4xdrawer.class, "_getcenterpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Home")),home.mostCurrent.activityBA);
 BA.debugLineNum = 51;BA.debugLine="Drawer.LeftPanel.LoadLayout(\"LayoutDrawer\")";
Debug.ShouldStop(262144);
home.mostCurrent._drawer.runClassMethod (com.modis.b4xdrawer.class, "_getleftpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("LayoutDrawer")),home.mostCurrent.activityBA);
 BA.debugLineNum = 53;BA.debugLine="Dim i As Int =0";
Debug.ShouldStop(1048576);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 54;BA.debugLine="For i=0 To 4";
Debug.ShouldStop(2097152);
{
final int step9 = 1;
final int limit9 = 4;
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 55;BA.debugLine="CLVSidebar.Add(CreateListItem(CLVSidebar.AsView.W";
Debug.ShouldStop(4194304);
home.mostCurrent._clvsidebar.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistitem(home.mostCurrent._clvsidebar.runMethod(false,"_asview").runMethod(true,"getWidth"),home.mostCurrent._clvsidebar.runMethod(false,"_asview").runMethod(true,"getHeight"),_i).getObject()),(Object)((_i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,89);
if (RapidSub.canDelegate("activity_pause")) { return com.modis.home.remoteMe.runUserSub(false, "home","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 89;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,85);
if (RapidSub.canDelegate("activity_resume")) { return com.modis.home.remoteMe.runUserSub(false, "home","activity_resume");}
 BA.debugLineNum = 85;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject _width,RemoteObject _height,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,64);
if (RapidSub.canDelegate("createlistitem")) { return com.modis.home.remoteMe.runUserSub(false, "home","createlistitem", _width, _height, _i);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("i", _i);
 BA.debugLineNum = 64;BA.debugLine="Sub CreateListItem(Width As Int, Height As Int,i A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 66;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2);
_p.runVoidMethod ("Initialize",home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 67;BA.debugLine="p.SetLayout(0, 0, Width, 60dip)";
Debug.ShouldStop(4);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(home.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 68;BA.debugLine="p.LoadLayout(\"LayoutIsIDrawer\")";
Debug.ShouldStop(8);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LayoutIsIDrawer")),home.mostCurrent.activityBA);
 BA.debugLineNum = 69;BA.debugLine="Select Case i";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(_i,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4))) {
case 0: {
 BA.debugLineNum = 71;BA.debugLine="LblisiSidebar.Text=\"Jadwal\"";
Debug.ShouldStop(64);
home.mostCurrent._lblisisidebar.runMethod(true,"setText",BA.ObjectToCharSequence("Jadwal"));
 BA.debugLineNum = 72;BA.debugLine="ImageViewSidebar.Bitmap= LoadBitmap(File.DirAss";
Debug.ShouldStop(128);
home.mostCurrent._imageviewsidebar.runMethod(false,"setBitmap",(home.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(home.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Group 286.png"))).getObject()));
 break; }
case 1: {
 BA.debugLineNum = 74;BA.debugLine="LblisiSidebar.Text=\"Lembur\"";
Debug.ShouldStop(512);
home.mostCurrent._lblisisidebar.runMethod(true,"setText",BA.ObjectToCharSequence("Lembur"));
 break; }
case 2: {
 BA.debugLineNum = 76;BA.debugLine="LblisiSidebar.Text=\"Dinas\"";
Debug.ShouldStop(2048);
home.mostCurrent._lblisisidebar.runMethod(true,"setText",BA.ObjectToCharSequence("Dinas"));
 break; }
case 3: {
 BA.debugLineNum = 78;BA.debugLine="LblisiSidebar.Text=\"Cuti\"";
Debug.ShouldStop(8192);
home.mostCurrent._lblisisidebar.runMethod(true,"setText",BA.ObjectToCharSequence("Cuti"));
 break; }
case 4: {
 BA.debugLineNum = 80;BA.debugLine="LblisiSidebar.Text=\"Sakit\"";
Debug.ShouldStop(32768);
home.mostCurrent._lblisisidebar.runMethod(true,"setText",BA.ObjectToCharSequence("Sakit"));
 break; }
}
;
 BA.debugLineNum = 82;BA.debugLine="Return p";
Debug.ShouldStop(131072);
if (true) return _p;
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private Drawer As B4XDrawer";
home.mostCurrent._drawer = RemoteObject.createNew ("com.modis.b4xdrawer");
 //BA.debugLineNum = 19;BA.debugLine="Private Label7 As Label";
home.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label8 As Label";
home.mostCurrent._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Label14 As Label";
home.mostCurrent._label14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ASRadioButton1 As ASRadioButton";
home.mostCurrent._asradiobutton1 = RemoteObject.createNew ("com.modis.asradiobutton");
 //BA.debugLineNum = 23;BA.debugLine="Private ASRadioButton2 As ASRadioButton";
home.mostCurrent._asradiobutton2 = RemoteObject.createNew ("com.modis.asradiobutton");
 //BA.debugLineNum = 24;BA.debugLine="Private ASRadioButton3 As ASRadioButton";
home.mostCurrent._asradiobutton3 = RemoteObject.createNew ("com.modis.asradiobutton");
 //BA.debugLineNum = 25;BA.debugLine="Private ASRadioButton5 As ASRadioButton";
home.mostCurrent._asradiobutton5 = RemoteObject.createNew ("com.modis.asradiobutton");
 //BA.debugLineNum = 26;BA.debugLine="Private ASRadioButton4 As ASRadioButton";
home.mostCurrent._asradiobutton4 = RemoteObject.createNew ("com.modis.asradiobutton");
 //BA.debugLineNum = 27;BA.debugLine="Private Label16 As Label";
home.mostCurrent._label16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Label6 As Label";
home.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Panel3 As Panel";
home.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Panel12 As Panel";
home.mostCurrent._panel12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Panel1 As Panel";
home.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Label19 As Label";
home.mostCurrent._label19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Label20 As Label";
home.mostCurrent._label20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private ImageView4 As ImageView";
home.mostCurrent._imageview4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private ImageView5 As ImageView";
home.mostCurrent._imageview5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Label2 As Label";
home.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private LabelCloseSidebar As Label";
home.mostCurrent._labelclosesidebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private CLVSidebar As CustomListView";
home.mostCurrent._clvsidebar = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 39;BA.debugLine="Private LblisiSidebar As Label";
home.mostCurrent._lblisisidebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private ImageViewSidebar As ImageView";
home.mostCurrent._imageviewsidebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview4_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView4_Click (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,122);
if (RapidSub.canDelegate("imageview4_click")) { return com.modis.home.remoteMe.runUserSub(false, "home","imageview4_click");}
 BA.debugLineNum = 122;BA.debugLine="Private Sub ImageView4_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Panel3.SetVisibleAnimated(200,False)";
Debug.ShouldStop(67108864);
home.mostCurrent._panel3.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(home.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 124;BA.debugLine="StartActivity(Absensi)";
Debug.ShouldStop(134217728);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.processBA,(Object)((home.mostCurrent._absensi.getObject())));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageview5_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView5_Click (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,127);
if (RapidSub.canDelegate("imageview5_click")) { return com.modis.home.remoteMe.runUserSub(false, "home","imageview5_click");}
 BA.debugLineNum = 127;BA.debugLine="Private Sub ImageView5_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Panel3.SetVisibleAnimated(200,False)";
Debug.ShouldStop(-2147483648);
home.mostCurrent._panel3.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(home.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 129;BA.debugLine="StartActivity(Absensi)";
Debug.ShouldStop(1);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.processBA,(Object)((home.mostCurrent._absensi.getObject())));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label14_click() throws Exception{
try {
		Debug.PushSubsStack("Label14_Click (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,102);
if (RapidSub.canDelegate("label14_click")) { return com.modis.home.remoteMe.runUserSub(false, "home","label14_click");}
 BA.debugLineNum = 102;BA.debugLine="Private Sub Label14_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="ASRadioButton3.Checked = True";
Debug.ShouldStop(64);
home.mostCurrent._asradiobutton3.runClassMethod (com.modis.asradiobutton.class, "_setchecked" /*RemoteObject*/ ,home.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label15_click() throws Exception{
try {
		Debug.PushSubsStack("Label15_Click (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,106);
if (RapidSub.canDelegate("label15_click")) { return com.modis.home.remoteMe.runUserSub(false, "home","label15_click");}
 BA.debugLineNum = 106;BA.debugLine="Private Sub Label15_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="ASRadioButton4.Checked = True";
Debug.ShouldStop(1024);
home.mostCurrent._asradiobutton4.runClassMethod (com.modis.asradiobutton.class, "_setchecked" /*RemoteObject*/ ,home.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label16_click() throws Exception{
try {
		Debug.PushSubsStack("Label16_Click (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,110);
if (RapidSub.canDelegate("label16_click")) { return com.modis.home.remoteMe.runUserSub(false, "home","label16_click");}
 BA.debugLineNum = 110;BA.debugLine="Private Sub Label16_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="ASRadioButton5.Checked = True";
Debug.ShouldStop(16384);
home.mostCurrent._asradiobutton5.runClassMethod (com.modis.asradiobutton.class, "_setchecked" /*RemoteObject*/ ,home.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click() throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,136);
if (RapidSub.canDelegate("label2_click")) { return com.modis.home.remoteMe.runUserSub(false, "home","label2_click");}
 BA.debugLineNum = 136;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Drawer.LeftOpen=True";
Debug.ShouldStop(256);
home.mostCurrent._drawer.runClassMethod (com.modis.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,home.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label6_click() throws Exception{
try {
		Debug.PushSubsStack("Label6_Click (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,114);
if (RapidSub.canDelegate("label6_click")) { return com.modis.home.remoteMe.runUserSub(false, "home","label6_click");}
 BA.debugLineNum = 114;BA.debugLine="Private Sub Label6_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="Panel1.SendToBack";
Debug.ShouldStop(524288);
home.mostCurrent._panel1.runVoidMethod ("SendToBack");
 BA.debugLineNum = 117;BA.debugLine="Panel12.SendToBack";
Debug.ShouldStop(1048576);
home.mostCurrent._panel12.runVoidMethod ("SendToBack");
 BA.debugLineNum = 118;BA.debugLine="Panel3.BringToFront";
Debug.ShouldStop(2097152);
home.mostCurrent._panel3.runVoidMethod ("BringToFront");
 BA.debugLineNum = 119;BA.debugLine="Panel3.SetVisibleAnimated(200,True)";
Debug.ShouldStop(4194304);
home.mostCurrent._panel3.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(home.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Label7_Click (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,94);
if (RapidSub.canDelegate("label7_click")) { return com.modis.home.remoteMe.runUserSub(false, "home","label7_click");}
 BA.debugLineNum = 94;BA.debugLine="Private Sub Label7_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="ASRadioButton1.Checked = True";
Debug.ShouldStop(1073741824);
home.mostCurrent._asradiobutton1.runClassMethod (com.modis.asradiobutton.class, "_setchecked" /*RemoteObject*/ ,home.mostCurrent.__c.getField(true,"True"));
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
public static RemoteObject  _label8_click() throws Exception{
try {
		Debug.PushSubsStack("Label8_Click (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,98);
if (RapidSub.canDelegate("label8_click")) { return com.modis.home.remoteMe.runUserSub(false, "home","label8_click");}
 BA.debugLineNum = 98;BA.debugLine="Private Sub Label8_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="ASRadioButton2.Checked = True";
Debug.ShouldStop(4);
home.mostCurrent._asradiobutton2.runClassMethod (com.modis.asradiobutton.class, "_setchecked" /*RemoteObject*/ ,home.mostCurrent.__c.getField(true,"True"));
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
public static RemoteObject  _labelclosesidebar_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCloseSidebar_Click (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,140);
if (RapidSub.canDelegate("labelclosesidebar_click")) { return com.modis.home.remoteMe.runUserSub(false, "home","labelclosesidebar_click");}
 BA.debugLineNum = 140;BA.debugLine="Private Sub LabelCloseSidebar_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="Drawer.LeftOpen=False";
Debug.ShouldStop(4096);
home.mostCurrent._drawer.runClassMethod (com.modis.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,home.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel3_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Panel3_Touch (home) ","home",4,home.mostCurrent.activityBA,home.mostCurrent,132);
if (RapidSub.canDelegate("panel3_touch")) { return com.modis.home.remoteMe.runUserSub(false, "home","panel3_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 132;BA.debugLine="Private Sub Panel3_Touch (Action As Int, X As Floa";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Panel3.SetVisibleAnimated(200,False)";
Debug.ShouldStop(16);
home.mostCurrent._panel3.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(home.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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