package com.modis;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class camex2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.modis.camex2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.modis.camex2.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.Camera2 _camera = null;
public anywheresoftware.b4j.object.JavaObject _jcamera = null;
public String _id = "";
public boolean _mfront = false;
public anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper _previewsize = null;
public anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper _capturesize = null;
public anywheresoftware.b4a.objects.collections.Map _previewsettingsmap = null;
public anywheresoftware.b4a.objects.collections.Map _capturesettingmap = null;
public anywheresoftware.b4a.objects.collections.List _bothmaps = null;
public anywheresoftware.b4a.objects.PanelWrapper _mpanel = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper _tv = null;
public anywheresoftware.b4j.object.JavaObject _staticcapturerequest = null;
public anywheresoftware.b4j.object.JavaObject _staticcameracharacteristics = null;
public anywheresoftware.b4j.object.JavaObject _staticcaptureresult = null;
public anywheresoftware.b4a.objects.collections.List _af_state = null;
public anywheresoftware.b4a.objects.collections.List _flash_state = null;
public anywheresoftware.b4a.objects.collections.List _af_mode = null;
public anywheresoftware.b4a.objects.collections.List _ae_mode = null;
public anywheresoftware.b4a.objects.collections.List _flash_mode = null;
public anywheresoftware.b4a.objects.collections.List _scene_mode = null;
public anywheresoftware.b4a.objects.collections.List _effect_mode = null;
public anywheresoftware.b4a.objects.collections.List _supported_hardware_level = null;
public anywheresoftware.b4a.objects.collections.List _control_mode = null;
public boolean _printkeys = false;
public anywheresoftware.b4j.object.JavaObject _previewrequest = null;
public String _focusstate = "";
public anywheresoftware.b4j.object.JavaObject _mediarecorder = null;
public boolean _recordingvideo = false;
public int _taskindex = 0;
public b4a.example.dateutils _dateutils = null;
public com.modis.main _main = null;
public com.modis.starter _starter = null;
public com.modis.general _general = null;
public com.modis.register _register = null;
public com.modis.home _home = null;
public com.modis.absensi _absensi = null;
public com.modis.xuiviewsutils _xuiviewsutils = null;
public com.modis.httputils2service _httputils2service = null;
public String  _initialize(com.modis.camex2 __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _camerapanel) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_camerapanel}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub Initialize (CameraPanel As Panel)";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="mPanel = CameraPanel";
__ref._mpanel /*anywheresoftware.b4a.objects.PanelWrapper*/  = _camerapanel;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Camera.Initialize(\"Camera\")";
__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .Initialize(ba,"Camera");
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="jcamera = Camera";
__ref._jcamera /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ ));
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="PreviewSize.Initialize(640, 480)";
__ref._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ .Initialize((int) (640),(int) (480));
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="CaptureSize.Initialize(1920, 1080)";
__ref._capturesize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ .Initialize((int) (1920),(int) (1080));
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="StaticCaptureRequest.InitializeStatic(\"android.ha";
__ref._staticcapturerequest /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("android.hardware.camera2.CaptureRequest");
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="StaticCameraCharacteristics.InitializeStatic(\"and";
__ref._staticcameracharacteristics /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("android.hardware.camera2.CameraCharacteristics");
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="StaticCaptureResult.InitializeStatic(\"android.har";
__ref._staticcaptureresult /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("android.hardware.camera2.CaptureResult");
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="PreviewSettingsMap.Initialize";
__ref._previewsettingsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="CaptureSettingMap.Initialize";
__ref._capturesettingmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="bothMaps = Array(PreviewSettingsMap, CaptureSetti";
__ref._bothmaps /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._previewsettingsmap /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._capturesettingmap /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())});
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _opencamera(com.modis.camex2 __ref,boolean _front) throws Exception{
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "opencamera", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "opencamera", new Object[] {_front}));}
ResumableSub_OpenCamera rsub = new ResumableSub_OpenCamera(this,__ref,_front);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_OpenCamera extends BA.ResumableSub {
public ResumableSub_OpenCamera(com.modis.camex2 parent,com.modis.camex2 __ref,boolean _front) {
this.parent = parent;
this.__ref = __ref;
this._front = _front;
this.__ref = parent;
}
com.modis.camex2 __ref;
com.modis.camex2 parent;
boolean _front;
boolean _open = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="TaskIndex = TaskIndex + 1";
__ref._taskindex /*int*/  = (int) (__ref._taskindex /*int*/ +1);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="If Camera.IsCameraOpen Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .getIsCameraOpen()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Stop";
__ref._stop /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="mFront = Front";
__ref._mfront /*boolean*/  = _front;
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="id = Camera.FindCameraId(mFront)";
__ref._id /*String*/  = __ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .FindCameraId(__ref._mfront /*boolean*/ );
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="If id = \"\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((__ref._id /*String*/ ).equals("")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Log(\"Camera not found.\")";
parent.__c.LogImpl("83276808","Camera not found.",0);
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="id = Camera.CameraIDs(0)";
__ref._id /*String*/  = __ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .getCameraIDs()[(int) (0)];
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="Camera.OpenCamera(id)";
__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .OpenCamera(__ref._id /*String*/ );
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="Wait For Camera_CameraState (Open As Boolean)";
parent.__c.WaitFor("camera_camerastate", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "opencamera"), null);
this.state = 18;
return;
case 18:
//C
this.state = 9;
_open = (Boolean) result[1];
;
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="If Open = False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_open==parent.__c.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="Log(\"Failed to open camera\")";
parent.__c.LogImpl("83276814","Failed to open camera",0);
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;
;
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="If PrintKeys Then PrintAllKeys(Camera.GetCameraCh";

case 12:
//if
this.state = 17;
if (__ref._printkeys /*boolean*/ ) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
__ref._printallkeys /*String*/ (null,__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .GetCameraCharacteristics(__ref._id /*String*/ ),"Camera Characteristics");
if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="Return TaskIndex";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._taskindex /*int*/ ));return;};
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparesurfaceforvideo(com.modis.camex2 __ref,int _mytaskindex,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "preparesurfaceforvideo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "preparesurfaceforvideo", new Object[] {_mytaskindex,_dir,_filename}));}
ResumableSub_PrepareSurfaceForVideo rsub = new ResumableSub_PrepareSurfaceForVideo(this,__ref,_mytaskindex,_dir,_filename);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSurfaceForVideo extends BA.ResumableSub {
public ResumableSub_PrepareSurfaceForVideo(com.modis.camex2 parent,com.modis.camex2 __ref,int _mytaskindex,String _dir,String _filename) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
this._dir = _dir;
this._filename = _filename;
this.__ref = parent;
}
com.modis.camex2 __ref;
com.modis.camex2 parent;
int _mytaskindex;
String _dir;
String _filename;
boolean _result = false;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_mytaskindex!=__ref._taskindex /*int*/ ) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="CloseSession";
__ref._closesession /*String*/ (null);
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Wait For (CreateSurface) Complete (Result As Bool";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "preparesurfaceforvideo"), __ref._createsurface /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_mytaskindex!=__ref._taskindex /*int*/ ) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="File.Delete(Dir, FileName)";
parent.__c.File.Delete(_dir,_filename);
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="MediaRecorder = Camera.CreateMediaRecorder(Previe";
__ref._mediarecorder /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .CreateMediaRecorder(__ref._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ ,_dir,_filename)));
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="MediaRecorder.RunMethod(\"setOrientationHint\", Arr";
__ref._mediarecorder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOrientationHint",new Object[]{(Object)(__ref._gethintorientation /*int*/ (null))});
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="Camera.StartSession(tv, PreviewSize, CaptureSize,";
__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .StartSession((android.view.TextureView)(__ref._tv /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ .getObject()),__ref._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ ,__ref._capturesize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ ,(int) (0),(int) (0),parent.__c.True);
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="Wait For Camera_SessionConfigured (Success As Boo";
parent.__c.WaitFor("camera_sessionconfigured", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "preparesurfaceforvideo"), null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 13:
//if
this.state = 18;
if (_mytaskindex!=__ref._taskindex /*int*/ ) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparesurface(com.modis.camex2 __ref,int _mytaskindex) throws Exception{
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "preparesurface", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "preparesurface", new Object[] {_mytaskindex}));}
ResumableSub_PrepareSurface rsub = new ResumableSub_PrepareSurface(this,__ref,_mytaskindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSurface extends BA.ResumableSub {
public ResumableSub_PrepareSurface(com.modis.camex2 parent,com.modis.camex2 __ref,int _mytaskindex) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
this.__ref = parent;
}
com.modis.camex2 __ref;
com.modis.camex2 parent;
int _mytaskindex;
boolean _result = false;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_mytaskindex!=__ref._taskindex /*int*/ ) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="CloseSession";
__ref._closesession /*String*/ (null);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Wait For (CreateSurface) Complete (Result As Bool";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "preparesurface"), __ref._createsurface /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_mytaskindex!=__ref._taskindex /*int*/ ) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="Camera.StartSession(tv, PreviewSize, CaptureSize,";
__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .StartSession((android.view.TextureView)(__ref._tv /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ .getObject()),__ref._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ ,__ref._capturesize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ ,(int) (256),(int) (0),parent.__c.False);
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="Wait For Camera_SessionConfigured (Success As Boo";
parent.__c.WaitFor("camera_sessionconfigured", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "preparesurface"), null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 13:
//if
this.state = 18;
if (_mytaskindex!=__ref._taskindex /*int*/ ) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _startpreview(com.modis.camex2 __ref,int _mytaskindex,boolean _videorecording) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "startpreview", false))
	 {return ((String) Debug.delegate(ba, "startpreview", new Object[] {_mytaskindex,_videorecording}));}
anywheresoftware.b4j.object.JavaObject _previewbuilder = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub StartPreview (MyTaskIndex As Int, Video";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim PreviewBuilder As JavaObject";
_previewbuilder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="If VideoRecording Then";
if (_videorecording) { 
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="PreviewBuilder = Camera.CreateVideoRequestBuilde";
_previewbuilder = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .CreateVideoRequestBuilder()));
 }else {
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="PreviewBuilder = Camera.CreatePreviewBuilder";
_previewbuilder = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .CreatePreviewBuilder()));
 };
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="SetSettingsFromMap(PreviewBuilder, PreviewSetting";
__ref._setsettingsfrommap /*String*/ (null,_previewbuilder,__ref._previewsettingsmap /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="PreviewRequest = Camera.SetRepeatingRequest(Previ";
__ref._previewrequest /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .SetRepeatingRequest((Object)(_previewbuilder.getObject()))));
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="If PrintKeys Then PrintAllKeys(PreviewRequest, \"P";
if (__ref._printkeys /*boolean*/ ) { 
__ref._printallkeys /*String*/ (null,(Object)(__ref._previewrequest /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),"Preview Capture Request");};
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _boolstolist(com.modis.camex2 __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "boolstolist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "boolstolist", new Object[] {_obj}));}
anywheresoftware.b4a.objects.collections.List _res = null;
boolean[] _i = null;
boolean _ii = false;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub BoolsToList (Obj As Object) As List";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="If Obj = Null Then Return res";
if (_obj== null) { 
if (true) return _res;};
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Dim i() As Boolean = Obj";
_i = (boolean[])(_obj);
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="For Each ii As Boolean In i";
{
final boolean[] group5 = _i;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ii = group5[index5];
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="res.Add(ii)";
_res.Add((Object)(_ii));
 }
};
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _bytestolist(com.modis.camex2 __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "bytestolist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "bytestolist", new Object[] {_obj}));}
anywheresoftware.b4a.objects.collections.List _res = null;
byte[] _i = null;
byte _ii = (byte)0;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Private Sub BytesToList (Obj As Object) As List";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="If Obj = Null Then Return res";
if (_obj== null) { 
if (true) return _res;};
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Dim i() As Byte = Obj";
_i = (byte[])(_obj);
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="For Each ii As Byte In i";
{
final byte[] group5 = _i;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ii = group5[index5];
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="res.Add(ii)";
_res.Add((Object)(_ii));
 }
};
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="End Sub";
return null;
}
public String  _camera_previewcapturecomplete(com.modis.camex2 __ref,Object _captureresult) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "camera_previewcapturecomplete", false))
	 {return ((String) Debug.delegate(ba, "camera_previewcapturecomplete", new Object[] {_captureresult}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub Camera_PreviewCaptureComplete (Capture";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="FocusState = IntToConst(GetFromCaptureResult(Capt";
__ref._focusstate /*String*/  = __ref._inttoconst /*String*/ (null,__ref._getfromcaptureresult /*Object*/ (null,_captureresult,"CONTROL_AF_STATE"),__ref._af_state /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="End Sub";
return "";
}
public String  _inttoconst(com.modis.camex2 __ref,Object _int1,anywheresoftware.b4a.objects.collections.List _consts) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "inttoconst", false))
	 {return ((String) Debug.delegate(ba, "inttoconst", new Object[] {_int1,_consts}));}
int _i = 0;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub IntToConst (Int1 As Object, Consts As";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="If Int1 = Null Then Return \"\"";
if (_int1== null) { 
if (true) return "";};
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Dim i As Int = Int1";
_i = (int)(BA.ObjectToNumber(_int1));
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="If i >= 0 And i < Consts.Size Then";
if (_i>=0 && _i<_consts.getSize()) { 
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Return Consts.Get(i)";
if (true) return BA.ObjectToString(_consts.Get(_i));
 }else {
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="Log(Consts)'ignore";
__c.LogImpl("86094854",BA.ObjectToString(_consts),0);
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="Log(\"Unknown const: \" & i)";
__c.LogImpl("86094855","Unknown const: "+BA.NumberToString(_i),0);
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="End Sub";
return "";
}
public Object  _getfromcaptureresult(com.modis.camex2 __ref,Object _captureresult,String _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getfromcaptureresult", false))
	 {return ((Object) Debug.delegate(ba, "getfromcaptureresult", new Object[] {_captureresult,_field}));}
anywheresoftware.b4j.object.JavaObject _jresult = null;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub GetFromCaptureResult(CaptureResult As";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim jresult As JavaObject = CaptureResult";
_jresult = new anywheresoftware.b4j.object.JavaObject();
_jresult = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_captureresult));
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Return jresult.RunMethod(\"get\", Array(StaticCaptu";
if (true) return _jresult.RunMethod("get",new Object[]{__ref._staticcaptureresult /*anywheresoftware.b4j.object.JavaObject*/ .GetField(_field)});
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Public Camera As Camera2";
_camera = new anywheresoftware.b4a.objects.Camera2();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Private jcamera As JavaObject";
_jcamera = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Private id As String";
_id = "";
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Private mFront As Boolean = False";
_mfront = __c.False;
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Public PreviewSize, CaptureSize As CameraSize";
_previewsize = new anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper();
_capturesize = new anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper();
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Public PreviewSettingsMap, CaptureSettingMap As M";
_previewsettingsmap = new anywheresoftware.b4a.objects.collections.Map();
_capturesettingmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="Private bothMaps As List";
_bothmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Private mPanel As Panel";
_mpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="Private tv As View";
_tv = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="Private StaticCaptureRequest As JavaObject";
_staticcapturerequest = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Private StaticCameraCharacteristics As JavaObject";
_staticcameracharacteristics = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="Private StaticCaptureResult As JavaObject";
_staticcaptureresult = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="Private AF_STATE As List = Array(\"INACTIVE\", \"PAS";
_af_state = new anywheresoftware.b4a.objects.collections.List();
_af_state = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("INACTIVE"),(Object)("PASSIVE_SCAN"),(Object)("PASSIVE_FOCUSED"),(Object)("ACTIVE_SCAN"),(Object)("FOCUSED_LOCKED"),(Object)("NOT_FOCUSED_LOCKED"),(Object)("PASSIVE_UNFOCUSED")});
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="Private FLASH_STATE As List = Array(\"UNAVAILABLE\"";
_flash_state = new anywheresoftware.b4a.objects.collections.List();
_flash_state = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("UNAVAILABLE"),(Object)("CHARGING"),(Object)("READY"),(Object)("FIRED"),(Object)("PARTIAL")});
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="Private AF_MODE As List = Array(\"OFF\", \"AUTO\", \"M";
_af_mode = new anywheresoftware.b4a.objects.collections.List();
_af_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("OFF"),(Object)("AUTO"),(Object)("MACRO"),(Object)("CONTINUOUS_VIDEO"),(Object)("CONTINUOUS_PICTURE"),(Object)("EDOF")});
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="Private AE_MODE As List = Array(\"OFF\", \"ON\", \"ON_";
_ae_mode = new anywheresoftware.b4a.objects.collections.List();
_ae_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("OFF"),(Object)("ON"),(Object)("ON_AUTO_FLASH"),(Object)("ON_ALWAYS_FLASH"),(Object)("ON_AUTO_FLASH_REDEYE")});
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="Private FLASH_MODE As List = Array(\"OFF\", \"SINGLE";
_flash_mode = new anywheresoftware.b4a.objects.collections.List();
_flash_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("OFF"),(Object)("SINGLE"),(Object)("TORCH")});
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="Private SCENE_MODE As List = Array(\"DISABLED\", \"F";
_scene_mode = new anywheresoftware.b4a.objects.collections.List();
_scene_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("DISABLED"),(Object)("FACE_PRIORITY"),(Object)("ACTION"),(Object)("PORTRAIT"),(Object)("LANDSCAPE"),(Object)("NIGHT"),(Object)("PORTRAIT"),(Object)("THEATRE"),(Object)("BEACH"),(Object)("SNOW"),(Object)("SUNSET"),(Object)("STEADYPHOTO"),(Object)("FIREWORKS"),(Object)("SPORTS"),(Object)("PARTY"),(Object)("CANDLELIGHT"),(Object)("BARCODE"),(Object)("HIGH_SPEED_VIDEO"),(Object)("MODE_HDR"),(Object)("FACE_PRIORITY_LOW_LIGHT")});
RDebugUtils.currentLine=3145750;
 //BA.debugLineNum = 3145750;BA.debugLine="Private EFFECT_MODE As List = Array(\"OFF\", \"MONO\"";
_effect_mode = new anywheresoftware.b4a.objects.collections.List();
_effect_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("OFF"),(Object)("MONO"),(Object)("NEGATIVE"),(Object)("SOLARIZE"),(Object)("SEPIA"),(Object)("POSTERIZE"),(Object)("WHITEBOARD"),(Object)("BLACKBOARD"),(Object)("AQUA")});
RDebugUtils.currentLine=3145751;
 //BA.debugLineNum = 3145751;BA.debugLine="Private SUPPORTED_HARDWARE_LEVEL As List = Array(";
_supported_hardware_level = new anywheresoftware.b4a.objects.collections.List();
_supported_hardware_level = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("LIMITED"),(Object)("FULL"),(Object)("LEGACY"),(Object)("LEVEL_3")});
RDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="Private CONTROL_MODE As List = Array(\"OFF\", \"AUTO";
_control_mode = new anywheresoftware.b4a.objects.collections.List();
_control_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("OFF"),(Object)("AUTO"),(Object)("USE_SCENE_MODE"),(Object)("OFF_KEEP_STATE")});
RDebugUtils.currentLine=3145753;
 //BA.debugLineNum = 3145753;BA.debugLine="Public PrintKeys As Boolean = False";
_printkeys = __c.False;
RDebugUtils.currentLine=3145754;
 //BA.debugLineNum = 3145754;BA.debugLine="Private PreviewRequest As JavaObject";
_previewrequest = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3145755;
 //BA.debugLineNum = 3145755;BA.debugLine="Private FocusState As String";
_focusstate = "";
RDebugUtils.currentLine=3145756;
 //BA.debugLineNum = 3145756;BA.debugLine="Private MediaRecorder As JavaObject";
_mediarecorder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3145757;
 //BA.debugLineNum = 3145757;BA.debugLine="Public RecordingVideo As Boolean";
_recordingvideo = false;
RDebugUtils.currentLine=3145758;
 //BA.debugLineNum = 3145758;BA.debugLine="Public TaskIndex As Int = 1";
_taskindex = (int) (1);
RDebugUtils.currentLine=3145759;
 //BA.debugLineNum = 3145759;BA.debugLine="End Sub";
return "";
}
public String  _closesession(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "closesession", false))
	 {return ((String) Debug.delegate(ba, "closesession", null));}
anywheresoftware.b4j.object.JavaObject _session = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub CloseSession";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim session As JavaObject = jcamera.GetFieldJO(\"c";
_session = new anywheresoftware.b4j.object.JavaObject();
_session = __ref._jcamera /*anywheresoftware.b4j.object.JavaObject*/ .GetFieldJO("captureSession");
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="If session.IsInitialized Then";
if (_session.IsInitialized()) { 
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="session.RunMethod(\"stopRepeating\", Null)";
_session.RunMethod("stopRepeating",(Object[])(__c.Null));
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="session.RunMethod(\"abortCaptures\", Null)";
_session.RunMethod("abortCaptures",(Object[])(__c.Null));
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="jcamera.SetField(\"captureSession\", Null)";
__ref._jcamera /*anywheresoftware.b4j.object.JavaObject*/ .SetField("captureSession",__c.Null);
 };
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createsurface(com.modis.camex2 __ref) throws Exception{
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "createsurface", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "createsurface", null));}
ResumableSub_CreateSurface rsub = new ResumableSub_CreateSurface(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateSurface extends BA.ResumableSub {
public ResumableSub_CreateSurface(com.modis.camex2 parent,com.modis.camex2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.modis.camex2 __ref;
com.modis.camex2 parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If tv.IsInitialized Then tv.RemoveView";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._tv /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ .IsInitialized()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._tv /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ .RemoveView();
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="tv = Camera.CreateSurface";
__ref._tv /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/  = __ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .CreateSurface(ba);
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="mPanel.AddView(tv, 0, 0, mPanel.Width, mPanel.Hei";
__ref._mpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._tv /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._mpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="tv.SendToBack";
__ref._tv /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ .SendToBack();
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Wait For Camera_SurfaceReady";
parent.__c.WaitFor("camera_surfaceready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "createsurface"), null);
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _datatobitmap(com.modis.camex2 __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "datatobitmap", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "datatobitmap", new Object[] {_data}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub DataToBitmap(Data() As Byte) As Bitmap";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="in.InitializeFromBytesArray(Data, 0, Data.Length)";
_in.InitializeFromBytesArray(_data,(int) (0),_data.length);
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="bmp.Initialize2(in)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="in.Close";
_in.Close();
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="End Sub";
return null;
}
public String  _datatofile(com.modis.camex2 __ref,byte[] _data,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "datatofile", false))
	 {return ((String) Debug.delegate(ba, "datatofile", new Object[] {_data,_dir,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub DataToFile(Data() As Byte, Dir As Strin";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _floatstolist(com.modis.camex2 __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "floatstolist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "floatstolist", new Object[] {_obj}));}
anywheresoftware.b4a.objects.collections.List _res = null;
float[] _f = null;
float _ff = 0f;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub FloatsToList (Obj As Object) As List";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="If Obj = Null Then Return res";
if (_obj== null) { 
if (true) return _res;};
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="Dim f() As Float = Obj";
_f = (float[])(_obj);
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="For Each ff As Float In f";
{
final float[] group5 = _f;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ff = group5[index5];
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="res.Add(ff)";
_res.Add((Object)(_ff));
 }
};
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _focusandtakepicture(com.modis.camex2 __ref,int _mytaskindex) throws Exception{
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "focusandtakepicture", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "focusandtakepicture", new Object[] {_mytaskindex}));}
ResumableSub_FocusAndTakePicture rsub = new ResumableSub_FocusAndTakePicture(this,__ref,_mytaskindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FocusAndTakePicture extends BA.ResumableSub {
public ResumableSub_FocusAndTakePicture(com.modis.camex2 parent,com.modis.camex2 __ref,int _mytaskindex) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
this.__ref = parent;
}
com.modis.camex2 __ref;
com.modis.camex2 parent;
int _mytaskindex;
String _previewfocusmode = "";
String _previewaemode = "";
anywheresoftware.b4j.object.JavaObject _previewbuilder = null;
boolean _success = false;
byte[] _data = null;
Object _captureresult = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim PreviewFocusMode As String = AF_MODE.Get(GetF";
_previewfocusmode = BA.ObjectToString(__ref._af_mode /*anywheresoftware.b4a.objects.collections.List*/ .Get((int)(BA.ObjectToNumber(__ref._getfromcapturerequest /*Object*/ (null,(Object)(__ref._previewrequest /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),"CONTROL_AF_MODE")))));
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Dim PreviewAEMode As String = AE_MODE.Get(GetFrom";
_previewaemode = BA.ObjectToString(__ref._ae_mode /*anywheresoftware.b4a.objects.collections.List*/ .Get((int)(BA.ObjectToNumber(__ref._getfromcapturerequest /*Object*/ (null,(Object)(__ref._previewrequest /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),"CONTROL_AE_MODE")))));
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="If PreviewFocusMode = \"OFF\" Or PreviewFocusMode =";
if (true) break;

case 1:
//if
this.state = 12;
if ((_previewfocusmode).equals("OFF") || (_previewfocusmode).equals("EDOF")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="Else if PreviewFocusMode.Contains(\"CONTINUOUS\") =";
if (_previewfocusmode.contains("CONTINUOUS")==parent.__c.False || (_previewaemode).equals("ON_ALWAYS_FLASH")) { 
this.state = 5;
}}
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="Log(\"Focus not supported\")";
parent.__c.LogImpl("85308420","Focus not supported",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="Dim PreviewBuilder As JavaObject = Camera.Create";
_previewbuilder = new anywheresoftware.b4j.object.JavaObject();
_previewbuilder = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .CreatePreviewBuilder()));
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="PreviewSettingsMap.Put(\"CONTROL_AF_TRIGGER\", 1)";
__ref._previewsettingsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CONTROL_AF_TRIGGER"),(Object)(1));
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="SetSettingsFromMap(PreviewBuilder, PreviewSettin";
__ref._setsettingsfrommap /*String*/ (null,_previewbuilder,__ref._previewsettingsmap /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="Camera.AddCaptureRequest(PreviewBuilder)";
__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .AddCaptureRequest((Object)(_previewbuilder.getObject()));
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="Wait For (WaitForFocusWithTimeout(5000)) Complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "focusandtakepicture"), __ref._waitforfocuswithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (5000)));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="If Success = False Then";
if (true) break;

case 6:
//if
this.state = 11;
if (_success==parent.__c.False) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="Log(\"Focus failed\")";
parent.__c.LogImpl("85308428","Focus failed",0);
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=5308430;
 //BA.debugLineNum = 5308430;BA.debugLine="Log(\"Focused!\")";
parent.__c.LogImpl("85308430","Focused!",0);
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=5308432;
 //BA.debugLineNum = 5308432;BA.debugLine="Wait For (TakePictureNow(MyTaskIndex)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "focusandtakepicture"), __ref._takepicturenow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mytaskindex));
this.state = 14;
return;
case 14:
//C
this.state = 12;
_data = (byte[]) result[1];
;
RDebugUtils.currentLine=5308433;
 //BA.debugLineNum = 5308433;BA.debugLine="Dim PreviewBuilder As JavaObject = Camera.Create";
_previewbuilder = new anywheresoftware.b4j.object.JavaObject();
_previewbuilder = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .CreatePreviewBuilder()));
RDebugUtils.currentLine=5308434;
 //BA.debugLineNum = 5308434;BA.debugLine="PreviewSettingsMap.Put(\"CONTROL_AF_TRIGGER\", 2)";
__ref._previewsettingsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CONTROL_AF_TRIGGER"),(Object)(2));
RDebugUtils.currentLine=5308435;
 //BA.debugLineNum = 5308435;BA.debugLine="SetSettingsFromMap(PreviewBuilder, PreviewSettin";
__ref._setsettingsfrommap /*String*/ (null,_previewbuilder,__ref._previewsettingsmap /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=5308436;
 //BA.debugLineNum = 5308436;BA.debugLine="Camera.AddCaptureRequest(PreviewBuilder)";
__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .AddCaptureRequest((Object)(_previewbuilder.getObject()));
RDebugUtils.currentLine=5308437;
 //BA.debugLineNum = 5308437;BA.debugLine="PreviewSettingsMap.Remove(\"CONTROL_AF_TRIGGER\")";
__ref._previewsettingsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)("CONTROL_AF_TRIGGER"));
RDebugUtils.currentLine=5308438;
 //BA.debugLineNum = 5308438;BA.debugLine="Wait For (PreviewBuilder) Camera_CaptureComplete";
parent.__c.WaitFor("camera_capturecomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "focusandtakepicture"), (Object)(_previewbuilder.getObject()));
this.state = 15;
return;
case 15:
//C
this.state = 12;
_captureresult = (Object) result[1];
;
RDebugUtils.currentLine=5308439;
 //BA.debugLineNum = 5308439;BA.debugLine="Return data";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_data));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=5308441;
 //BA.debugLineNum = 5308441;BA.debugLine="Wait For (TakePictureNow(MyTaskIndex)) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "focusandtakepicture"), __ref._takepicturenow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mytaskindex));
this.state = 16;
return;
case 16:
//C
this.state = -1;
_data = (byte[]) result[1];
;
RDebugUtils.currentLine=5308442;
 //BA.debugLineNum = 5308442;BA.debugLine="Return data";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_data));return;};
RDebugUtils.currentLine=5308443;
 //BA.debugLineNum = 5308443;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object  _getfromcapturerequest(com.modis.camex2 __ref,Object _capturerequest,String _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getfromcapturerequest", false))
	 {return ((Object) Debug.delegate(ba, "getfromcapturerequest", new Object[] {_capturerequest,_field}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub GetFromCaptureRequest(CaptureRequest A";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim jo As JavaObject = CaptureRequest";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_capturerequest));
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Return jo.RunMethod(\"get\", Array(StaticCaptureReq";
if (true) return _jo.RunMethod("get",new Object[]{__ref._staticcapturerequest /*anywheresoftware.b4j.object.JavaObject*/ .GetField(_field)});
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="End Sub";
return null;
}
public String  _setsettingsfrommap(com.modis.camex2 __ref,anywheresoftware.b4j.object.JavaObject _builder,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setsettingsfrommap", false))
	 {return ((String) Debug.delegate(ba, "setsettingsfrommap", new Object[] {_builder,_m}));}
String _key = "";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub SetSettingsFromMap (Builder As JavaObj";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="For Each key As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Builder.RunMethod(\"set\", Array(StaticCaptureRequ";
_builder.RunMethod("set",new Object[]{__ref._staticcapturerequest /*anywheresoftware.b4j.object.JavaObject*/ .GetField(_key),_m.Get((Object)(_key))});
 }
};
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _waitforfocuswithtimeout(com.modis.camex2 __ref,int _timeoutms) throws Exception{
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "waitforfocuswithtimeout", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "waitforfocuswithtimeout", new Object[] {_timeoutms}));}
ResumableSub_WaitForFocusWithTimeout rsub = new ResumableSub_WaitForFocusWithTimeout(this,__ref,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_WaitForFocusWithTimeout extends BA.ResumableSub {
public ResumableSub_WaitForFocusWithTimeout(com.modis.camex2 parent,com.modis.camex2 __ref,int _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
this.__ref = parent;
}
com.modis.camex2 __ref;
com.modis.camex2 parent;
int _timeoutms;
long _start = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Do Until FocusState = \"FOCUSED_LOCKED\" Or FocusSt";
if (true) break;

case 1:
//do until
this.state = 10;
while (!((__ref._focusstate /*String*/ ).equals("FOCUSED_LOCKED") || (__ref._focusstate /*String*/ ).equals("NOT_FOCUSED_LOCKED"))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "waitforfocuswithtimeout"),(int) (50));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="If DateTime.Now - start > TimeoutMs Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.DateTime.getNow()-_start>_timeoutms) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 9:
//C
this.state = 1;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="Return FocusState = \"FOCUSED_LOCKED\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)((__ref._focusstate /*String*/ ).equals("FOCUSED_LOCKED")));return;};
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _takepicturenow(com.modis.camex2 __ref,int _mytaskindex) throws Exception{
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "takepicturenow", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "takepicturenow", new Object[] {_mytaskindex}));}
ResumableSub_TakePictureNow rsub = new ResumableSub_TakePictureNow(this,__ref,_mytaskindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TakePictureNow extends BA.ResumableSub {
public ResumableSub_TakePictureNow(com.modis.camex2 parent,com.modis.camex2 __ref,int _mytaskindex) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
this.__ref = parent;
}
com.modis.camex2 __ref;
com.modis.camex2 parent;
int _mytaskindex;
anywheresoftware.b4j.object.JavaObject _builder = null;
Object _capturerequest = null;
byte[] _data = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_mytaskindex!=__ref._taskindex /*int*/ ) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Camera.AbortCaptures";
__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .AbortCaptures();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Dim builder As JavaObject = Camera.CreateCaptureB";
_builder = new anywheresoftware.b4j.object.JavaObject();
_builder = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .CreateCaptureBuilder()));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="CaptureSettingMap.Put(\"JPEG_ORIENTATION\", GetHint";
__ref._capturesettingmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("JPEG_ORIENTATION"),(Object)(__ref._gethintorientation /*int*/ (null)));
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="SetSettingsFromMap(builder, CaptureSettingMap)";
__ref._setsettingsfrommap /*String*/ (null,_builder,__ref._capturesettingmap /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Dim CaptureRequest As Object = Camera.AddCaptureR";
_capturerequest = __ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .AddCaptureRequest((Object)(_builder.getObject()));
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="If PrintKeys Then PrintAllKeys(CaptureRequest, \"C";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._printkeys /*boolean*/ ) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
__ref._printallkeys /*String*/ (null,_capturerequest,"Capture Request");
if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Wait For Camera_PictureTaken (Data() As Byte)";
parent.__c.WaitFor("camera_picturetaken", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "takepicturenow"), null);
this.state = 13;
return;
case 13:
//C
this.state = -1;
_data = (byte[]) result[1];
;
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="StartPreview(MyTaskIndex, False)";
__ref._startpreview /*String*/ (null,_mytaskindex,parent.__c.False);
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="Return Data";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_data));return;};
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper  _getactivearraysize(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getactivearraysize", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper) Debug.delegate(ba, "getactivearraysize", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub getActiveArraySize As Rect";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Return GetFromCameraCharacteristic(\"SENSOR_INFO_A";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper(), (android.graphics.Rect)(__ref._getfromcameracharacteristic /*Object*/ (null,"SENSOR_INFO_ACTIVE_ARRAY_SIZE")));
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return null;
}
public Object  _getfromcameracharacteristic(com.modis.camex2 __ref,String _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getfromcameracharacteristic", false))
	 {return ((Object) Debug.delegate(ba, "getfromcameracharacteristic", new Object[] {_field}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub GetFromCameraCharacteristic (Field As";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim jo As JavaObject = Camera.GetCameraCharacteri";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .GetCameraCharacteristics(__ref._id /*String*/ )));
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Return jo.RunMethod(\"get\", Array(StaticCameraChar";
if (true) return _jo.RunMethod("get",new Object[]{__ref._staticcameracharacteristics /*anywheresoftware.b4j.object.JavaObject*/ .GetField(_field)});
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="End Sub";
return null;
}
public String  _getautoexposuremode(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getautoexposuremode", false))
	 {return ((String) Debug.delegate(ba, "getautoexposuremode", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub getAutoExposureMode As String";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
if (true) return __ref._inttoconst /*String*/ (null,__ref._getfromcapturerequest /*Object*/ (null,(Object)(__ref._previewrequest /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),"CONTROL_AE_MODE"),__ref._ae_mode /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return "";
}
public String  _getcontrolmode(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getcontrolmode", false))
	 {return ((String) Debug.delegate(ba, "getcontrolmode", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub getControlMode As String";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
if (true) return __ref._inttoconst /*String*/ (null,__ref._getfromcapturerequest /*Object*/ (null,(Object)(__ref._previewrequest /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),"CONTROL_MODE"),__ref._control_mode /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return "";
}
public String  _geteffectmode(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "geteffectmode", false))
	 {return ((String) Debug.delegate(ba, "geteffectmode", null));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub getEffectMode As String";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
if (true) return __ref._inttoconst /*String*/ (null,__ref._getfromcapturerequest /*Object*/ (null,(Object)(__ref._previewrequest /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),"CONTROL_EFFECT_MODE"),__ref._effect_mode /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
return "";
}
public String  _getfocusmode(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getfocusmode", false))
	 {return ((String) Debug.delegate(ba, "getfocusmode", null));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub getFocusMode As String";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
if (true) return __ref._inttoconst /*String*/ (null,__ref._getfromcapturerequest /*Object*/ (null,(Object)(__ref._previewrequest /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),"CONTROL_AF_MODE"),__ref._af_mode /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="End Sub";
return "";
}
public int  _gethintorientation(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "gethintorientation", false))
	 {return ((Integer) Debug.delegate(ba, "gethintorientation", null));}
int _sensororientation = 0;
int _front = 0;
int _orientation = 0;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub GetHintOrientation As Int";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim SensorOrientation As Int = GetFromCameraChara";
_sensororientation = (int)(BA.ObjectToNumber(__ref._getfromcameracharacteristic /*Object*/ (null,"SENSOR_ORIENTATION")));
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Dim front As Int = -1";
_front = (int) (-1);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="If getIsFrontFacingCamera Then front = 1";
if (__ref._getisfrontfacingcamera /*boolean*/ (null)) { 
_front = (int) (1);};
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="Dim orientation As Int = (SensorOrientation + jca";
_orientation = (int) ((_sensororientation+(double)(BA.ObjectToNumber(__ref._jcamera /*anywheresoftware.b4j.object.JavaObject*/ .GetField("lastKnownOrientation")))*_front+360)%360);
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Return orientation";
if (true) return _orientation;
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="End Sub";
return 0;
}
public boolean  _getisfrontfacingcamera(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getisfrontfacingcamera", false))
	 {return ((Boolean) Debug.delegate(ba, "getisfrontfacingcamera", null));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub getIsFrontFacingCamera As Boolean";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Return 0 = GetFromCameraCharacteristic(\"LENS_FACI";
if (true) return 0==(double)(BA.ObjectToNumber(__ref._getfromcameracharacteristic /*Object*/ (null,"LENS_FACING")));
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return false;
}
public float  _getmaxdigitalzoom(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getmaxdigitalzoom", false))
	 {return ((Float) Debug.delegate(ba, "getmaxdigitalzoom", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub getMaxDigitalZoom As Float";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Return GetFromCameraCharacteristic(\"SCALER_AVAILA";
if (true) return (float)(BA.ObjectToNumber(__ref._getfromcameracharacteristic /*Object*/ (null,"SCALER_AVAILABLE_MAX_DIGITAL_ZOOM")));
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return 0f;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getpreviewbitmap(com.modis.camex2 __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getpreviewbitmap", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getpreviewbitmap", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _mbmp = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub GetPreviewBitmap(Width As Int, Height A";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim mbmp As Bitmap";
_mbmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="mbmp.InitializeMutable(Width, Height)";
_mbmp.InitializeMutable(_width,_height);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Dim jo As JavaObject = tv";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._tv /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ .getObject()));
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="Return jo.RunMethod(\"getBitmap\", Array(mbmp))";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_jo.RunMethod("getBitmap",new Object[]{(Object)(_mbmp.getObject())})));
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="End Sub";
return null;
}
public String  _getscenemode(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getscenemode", false))
	 {return ((String) Debug.delegate(ba, "getscenemode", null));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub getSceneMode As String";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
if (true) return __ref._inttoconst /*String*/ (null,__ref._getfromcapturerequest /*Object*/ (null,(Object)(__ref._previewrequest /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),"CONTROL_SCENE_MODE"),__ref._scene_mode /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedautoexposuremodes(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedautoexposuremodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedautoexposuremodes", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub getSupportedAutoExposureModes As List";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Return IntsToConstsList(GetFromCameraCharacterist";
if (true) return __ref._intstoconstslist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._getfromcameracharacteristic /*Object*/ (null,"CONTROL_AE_AVAILABLE_MODES"),__ref._ae_mode /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _intstoconstslist(com.modis.camex2 __ref,Object _ints,anywheresoftware.b4a.objects.collections.List _consts) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "intstoconstslist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "intstoconstslist", new Object[] {_ints,_consts}));}
anywheresoftware.b4a.objects.collections.List _res = null;
int[] _f = null;
int _mode = 0;
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub IntsToConstsList (Ints As Object, Cons";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="If Ints = Null Then Return res";
if (_ints== null) { 
if (true) return _res;};
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="Dim f() As Int = Ints";
_f = (int[])(_ints);
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="For Each mode As Int In f";
{
final int[] group5 = _f;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_mode = group5[index5];
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="If mode >=0 And mode < Consts.Size Then";
if (_mode>=0 && _mode<_consts.getSize()) { 
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="res.Add(Consts.Get(mode))";
_res.Add(_consts.Get(_mode));
 }else {
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="Log(Consts) 'ignore";
__c.LogImpl("86160393",BA.ObjectToString(_consts),0);
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="Log(\"Unknown consts: \" & mode)";
__c.LogImpl("86160394","Unknown consts: "+BA.NumberToString(_mode),0);
 };
 }
};
RDebugUtils.currentLine=6160397;
 //BA.debugLineNum = 6160397;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6160398;
 //BA.debugLineNum = 6160398;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedcapturesizes(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedcapturesizes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedcapturesizes", null));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub getSupportedCaptureSizes As List";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Return Camera.GetSupportedCaptureSizes(id)";
if (true) return __ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .GetSupportedCaptureSizes(__ref._id /*String*/ );
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedeffectmodes(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedeffectmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedeffectmodes", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub getSupportedEffectModes As List";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Return IntsToConstsList(GetFromCameraCharacterist";
if (true) return __ref._intstoconstslist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._getfromcameracharacteristic /*Object*/ (null,"CONTROL_AVAILABLE_EFFECTS"),__ref._effect_mode /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedfocusmodes(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedfocusmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedfocusmodes", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub getSupportedFocusModes As List";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Return RemoveDuplicates(IntsToConstsList(GetFromC";
if (true) return __ref._removeduplicates /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._intstoconstslist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._getfromcameracharacteristic /*Object*/ (null,"CONTROL_AF_AVAILABLE_MODES"),__ref._af_mode /*anywheresoftware.b4a.objects.collections.List*/ ));
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _removeduplicates(com.modis.camex2 __ref,anywheresoftware.b4a.objects.collections.List _raw) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "removeduplicates", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "removeduplicates", new Object[] {_raw}));}
anywheresoftware.b4a.objects.collections.Map _unique = null;
String _f = "";
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Private Sub RemoveDuplicates(Raw As List) As List";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim unique As Map";
_unique = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="unique.Initialize";
_unique.Initialize();
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="For Each f As String In Raw";
{
final anywheresoftware.b4a.BA.IterableList group3 = _raw;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_f = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="unique.Put(f, \"\")";
_unique.Put((Object)(_f),(Object)(""));
 }
};
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Raw.Clear";
_raw.Clear();
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="For Each f As String In unique.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _unique.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_f = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="Raw.Add(f)";
_raw.Add((Object)(_f));
 }
};
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="Return Raw";
if (true) return _raw;
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="End Sub";
return null;
}
public String  _getsupportedhardwarelevel(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedhardwarelevel", false))
	 {return ((String) Debug.delegate(ba, "getsupportedhardwarelevel", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub getSupportedHardwareLevel As String";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim jo As JavaObject = Camera.GetCameraCharacteri";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .GetCameraCharacteristics(BA.NumberToString(0))));
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Return IntToConst(jo.RunMethod(\"get\", Array(Stati";
if (true) return __ref._inttoconst /*String*/ (null,_jo.RunMethod("get",new Object[]{__ref._staticcameracharacteristics /*anywheresoftware.b4j.object.JavaObject*/ .GetField("INFO_SUPPORTED_HARDWARE_LEVEL")}),__ref._supported_hardware_level /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedpreviewsizes(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedpreviewsizes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedpreviewsizes", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub getSupportedPreviewSizes As List";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Return Camera.GetSupportedPreviewSizes(id)";
if (true) return __ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .GetSupportedPreviewSizes(__ref._id /*String*/ );
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedscenemodes(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedscenemodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedscenemodes", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub getSupportedSceneModes As List";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Return RemoveDuplicates(IntsToConstsList(GetFromC";
if (true) return __ref._removeduplicates /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._intstoconstslist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._getfromcameracharacteristic /*Object*/ (null,"CONTROL_AVAILABLE_SCENE_MODES"),__ref._scene_mode /*anywheresoftware.b4a.objects.collections.List*/ ));
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedvideosizes(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedvideosizes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedvideosizes", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub getSupportedVideoSizes As List";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Return Camera.GetSupportedVideoSizes(id)";
if (true) return __ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .GetSupportedVideoSizes(__ref._id /*String*/ );
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _intstolist(com.modis.camex2 __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "intstolist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "intstolist", new Object[] {_obj}));}
anywheresoftware.b4a.objects.collections.List _res = null;
int[] _i = null;
int _ii = 0;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub IntsToList (Obj As Object) As List";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="If Obj = Null Then Return res";
if (_obj== null) { 
if (true) return _res;};
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim i() As Int = Obj";
_i = (int[])(_obj);
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="For Each ii As Int In i";
{
final int[] group5 = _i;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ii = group5[index5];
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="res.Add(ii)";
_res.Add((Object)(_ii));
 }
};
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _objectstolist(com.modis.camex2 __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "objectstolist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "objectstolist", new Object[] {_obj}));}
anywheresoftware.b4a.objects.collections.List _res = null;
Object[] _o = null;
Object _oo = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub ObjectsToList(Obj As Object) As List";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="If Obj = Null Then Return res";
if (_obj== null) { 
if (true) return _res;};
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Dim o() As Object = Obj";
_o = (Object[])(_obj);
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="For Each oo As Object In o";
{
final Object[] group5 = _o;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_oo = group5[index5];
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="res.Add(oo)";
_res.Add(_oo);
 }
};
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="End Sub";
return null;
}
public String  _stop(com.modis.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "stop", false))
	 {return ((String) Debug.delegate(ba, "stop", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub Stop";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="RecordingVideo = False";
__ref._recordingvideo /*boolean*/  = __c.False;
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Camera.Stop";
__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .Stop();
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="TaskIndex = TaskIndex + 1";
__ref._taskindex /*int*/  = (int) (__ref._taskindex /*int*/ +1);
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="End Sub";
return "";
}
public String  _printallkeys(com.modis.camex2 __ref,Object _cameramap,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "printallkeys", false))
	 {return ((String) Debug.delegate(ba, "printallkeys", new Object[] {_cameramap,_title}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.List _keys = null;
anywheresoftware.b4j.object.JavaObject _k = null;
Object _value = null;
String _typ = "";
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub PrintAllKeys (CameraMap As Object, tit";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Log($\"******  ${title} **********\"$)";
__c.LogImpl("86356993",("******  "+__c.SmartStringFormatter("",(Object)(_title))+" **********"),0);
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Dim jo As JavaObject = CameraMap";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_cameramap));
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="Dim keys As List = jo.RunMethod(\"getKeys\", Null)";
_keys = new anywheresoftware.b4a.objects.collections.List();
_keys = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jo.RunMethod("getKeys",(Object[])(__c.Null))));
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="For Each k As JavaObject In keys";
_k = new anywheresoftware.b4j.object.JavaObject();
{
final anywheresoftware.b4a.BA.IterableList group4 = _keys;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group4.Get(index4)));
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Dim value As Object = jo.RunMethod(\"get\", Array(";
_value = _jo.RunMethod("get",new Object[]{(Object)(_k.getObject())});
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="If value = Null Then Continue";
if (_value== null) { 
if (true) continue;};
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="Dim typ As String = GetType(value)";
_typ = __c.GetType(_value);
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="If typ = \"[F\" Then";
if ((_typ).equals("[F")) { 
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="value = FloatsToList(value)";
_value = (Object)(__ref._floatstolist /*anywheresoftware.b4a.objects.collections.List*/ (null,_value).getObject());
 }else 
{RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="Else If typ = \"[I\" Then";
if ((_typ).equals("[I")) { 
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="value = IntsToList(value)";
_value = (Object)(__ref._intstolist /*anywheresoftware.b4a.objects.collections.List*/ (null,_value).getObject());
 }else 
{RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="Else If typ = \"[Z\" Then";
if ((_typ).equals("[Z")) { 
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="value = BoolsToList(value)";
_value = (Object)(__ref._boolstolist /*anywheresoftware.b4a.objects.collections.List*/ (null,_value).getObject());
 }else 
{RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="Else If typ = \"[B\" Then";
if ((_typ).equals("[B")) { 
RDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="value = BytesToList(value)";
_value = (Object)(__ref._bytestolist /*anywheresoftware.b4a.objects.collections.List*/ (null,_value).getObject());
 }else 
{RDebugUtils.currentLine=6357008;
 //BA.debugLineNum = 6357008;BA.debugLine="Else if typ.StartsWith(\"[\") Then";
if (_typ.startsWith("[")) { 
RDebugUtils.currentLine=6357009;
 //BA.debugLineNum = 6357009;BA.debugLine="value = ObjectsToList(value)";
_value = (Object)(__ref._objectstolist /*anywheresoftware.b4a.objects.collections.List*/ (null,_value).getObject());
 }}}}}
;
RDebugUtils.currentLine=6357011;
 //BA.debugLineNum = 6357011;BA.debugLine="Log($\"${k.RunMethod(\"getName\", Null)}: ${value}\"";
__c.LogImpl("86357011",(""+__c.SmartStringFormatter("",_k.RunMethod("getName",(Object[])(__c.Null)))+": "+__c.SmartStringFormatter("",_value)+""),0);
 }
};
RDebugUtils.currentLine=6357013;
 //BA.debugLineNum = 6357013;BA.debugLine="End Sub";
return "";
}
public String  _setautoexposuremode(com.modis.camex2 __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setautoexposuremode", false))
	 {return ((String) Debug.delegate(ba, "setautoexposuremode", new Object[] {_mode}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub setAutoExposureMode (Mode As String)";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="SetBothMaps(\"CONTROL_AE_MODE\", AE_MODE.IndexOf(Mo";
__ref._setbothmaps /*String*/ (null,"CONTROL_AE_MODE",(Object)(__ref._ae_mode /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_mode))));
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="PreviewSettingsMap.Put(\"FLASH_MODE\", FLASH_MODE.I";
__ref._previewsettingsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FLASH_MODE"),(Object)(__ref._flash_mode /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)("OFF"))));
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="If Mode = \"ON_ALWAYS_FLASH\" Then";
if ((_mode).equals("ON_ALWAYS_FLASH")) { 
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="CaptureSettingMap.Put(\"FLASH_MODE\", FLASH_MODE.I";
__ref._capturesettingmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FLASH_MODE"),(Object)(__ref._flash_mode /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)("SINGLE"))));
 };
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="End Sub";
return "";
}
public String  _setbothmaps(com.modis.camex2 __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setbothmaps", false))
	 {return ((String) Debug.delegate(ba, "setbothmaps", new Object[] {_key,_value}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub SetBothMaps(Key As String, Value As Ob";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="For Each m As Map In bothMaps";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._bothmaps /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="m.Put(Key, Value)";
_m.Put((Object)(_key),_value);
 }
};
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="End Sub";
return "";
}
public String  _seteffectmode(com.modis.camex2 __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "seteffectmode", false))
	 {return ((String) Debug.delegate(ba, "seteffectmode", new Object[] {_mode}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub setEffectMode(Mode As String)";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="SetBothMaps(\"CONTROL_EFFECT_MODE\", EFFECT_MODE.In";
__ref._setbothmaps /*String*/ (null,"CONTROL_EFFECT_MODE",(Object)(__ref._effect_mode /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_mode))));
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return "";
}
public String  _setfocusmode(com.modis.camex2 __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setfocusmode", false))
	 {return ((String) Debug.delegate(ba, "setfocusmode", new Object[] {_mode}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub setFocusMode(mode As String)";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="SetBothMaps(\"CONTROL_AF_MODE\", AF_MODE.IndexOf(mo";
__ref._setbothmaps /*String*/ (null,"CONTROL_AF_MODE",(Object)(__ref._af_mode /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_mode))));
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return "";
}
public String  _setpreviewcropregion(com.modis.camex2 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setpreviewcropregion", false))
	 {return ((String) Debug.delegate(ba, "setpreviewcropregion", new Object[] {_r}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub setPreviewCropRegion(r As Rect)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="PreviewSettingsMap.Put(\"SCALER_CROP_REGION\", r)";
__ref._previewsettingsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("SCALER_CROP_REGION"),(Object)(_r.getObject()));
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
public String  _setscenemode(com.modis.camex2 __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setscenemode", false))
	 {return ((String) Debug.delegate(ba, "setscenemode", new Object[] {_mode}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub setSceneMode(Mode As String)";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="SetBothMaps(\"CONTROL_SCENE_MODE\", SCENE_MODE.Inde";
__ref._setbothmaps /*String*/ (null,"CONTROL_SCENE_MODE",(Object)(__ref._scene_mode /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_mode))));
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return "";
}
public String  _startvideorecording(com.modis.camex2 __ref,int _mytaskindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "startvideorecording", false))
	 {return ((String) Debug.delegate(ba, "startvideorecording", new Object[] {_mytaskindex}));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub StartVideoRecording (MyTaskIndex As Int";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return";
if (_mytaskindex!=__ref._taskindex /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="MediaRecorder.RunMethod(\"start\", Null)";
__ref._mediarecorder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("start",(Object[])(__c.Null));
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="RecordingVideo = True";
__ref._recordingvideo /*boolean*/  = __c.True;
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="End Sub";
return "";
}
public String  _stopvideorecording(com.modis.camex2 __ref,int _mytaskindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "stopvideorecording", false))
	 {return ((String) Debug.delegate(ba, "stopvideorecording", new Object[] {_mytaskindex}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub StopVideoRecording (MyTaskIndex As Int)";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="CloseSession";
__ref._closesession /*String*/ (null);
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Try";
try {RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="MediaRecorder.RunMethod(\"stop\", Null)";
__ref._mediarecorder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("stop",(Object[])(__c.Null));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="Log(LastException)";
__c.LogImpl("83735557",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="RecordingVideo = False";
__ref._recordingvideo /*boolean*/  = __c.False;
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _takepicturesnow(com.modis.camex2 __ref,int _mytaskindex,int _numberofpictures) throws Exception{
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "takepicturesnow", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "takepicturesnow", new Object[] {_mytaskindex,_numberofpictures}));}
ResumableSub_TakePicturesNow rsub = new ResumableSub_TakePicturesNow(this,__ref,_mytaskindex,_numberofpictures);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TakePicturesNow extends BA.ResumableSub {
public ResumableSub_TakePicturesNow(com.modis.camex2 parent,com.modis.camex2 __ref,int _mytaskindex,int _numberofpictures) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
this._numberofpictures = _numberofpictures;
this.__ref = parent;
}
com.modis.camex2 __ref;
com.modis.camex2 parent;
int _mytaskindex;
int _numberofpictures;
anywheresoftware.b4j.object.JavaObject _builder = null;
anywheresoftware.b4a.objects.collections.List _result = null;
int _i = 0;
byte[] _data = null;
int step8;
int limit8;
int step11;
int limit11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_mytaskindex!=__ref._taskindex /*int*/ ) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Camera.AbortCaptures";
__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .AbortCaptures();
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Dim builder As JavaObject = Camera.CreateCaptureB";
_builder = new anywheresoftware.b4j.object.JavaObject();
_builder = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .CreateCaptureBuilder()));
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="CaptureSettingMap.Put(\"JPEG_ORIENTATION\", GetHint";
__ref._capturesettingmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("JPEG_ORIENTATION"),(Object)(__ref._gethintorientation /*int*/ (null)));
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="SetSettingsFromMap(builder, CaptureSettingMap)";
__ref._setsettingsfrommap /*String*/ (null,_builder,__ref._capturesettingmap /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="For i = 1 To NumberOfPictures";
if (true) break;

case 7:
//for
this.state = 10;
step8 = 1;
limit8 = _numberofpictures;
_i = (int) (1) ;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 10;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 9;
if (true) break;

case 15:
//C
this.state = 14;
_i = ((int)(0 + _i + step8)) ;
if (true) break;

case 9:
//C
this.state = 15;
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="Camera.AddCaptureRequest(builder)";
__ref._camera /*anywheresoftware.b4a.objects.Camera2*/ .AddCaptureRequest((Object)(_builder.getObject()));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="For i = 1 To NumberOfPictures";

case 10:
//for
this.state = 13;
step11 = 1;
limit11 = _numberofpictures;
_i = (int) (1) ;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 13;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 12;
if (true) break;

case 17:
//C
this.state = 16;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 12:
//C
this.state = 17;
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="Wait For Camera_PictureTaken (Data() As Byte)";
parent.__c.WaitFor("camera_picturetaken", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "camex2", "takepicturesnow"), null);
this.state = 18;
return;
case 18:
//C
this.state = 17;
_data = (byte[]) result[1];
;
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="result.Add(Data)";
_result.Add((Object)(_data));
 if (true) break;
if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=5570575;
 //BA.debugLineNum = 5570575;BA.debugLine="StartPreview(MyTaskIndex, False)";
__ref._startpreview /*String*/ (null,_mytaskindex,parent.__c.False);
RDebugUtils.currentLine=5570576;
 //BA.debugLineNum = 5570576;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=5570577;
 //BA.debugLineNum = 5570577;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}