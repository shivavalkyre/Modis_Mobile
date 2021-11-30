B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private frontCamera As Boolean = True
	Private rp As RuntimePermissions
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private cam As CamEx2
	Private MyTaskIndex As Int
	Private pnlCamera As Panel
	Private VideoMode As Boolean = False
	Private VideoFileDir, VideoFileName As String
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Absensi")
	cam.Initialize(pnlCamera)
	OpenCamera(frontCamera)
	'camEx2.Initialize(pnlCamera, frontCamera, Me, "Camera1")
		

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub OpenCamera (front As Boolean)
	
	For Each permission As String In Array(rp.PERMISSION_CAMERA)
		rp.CheckAndRequest(permission)
		Wait For Activity_PermissionResult (permission As String, Result As Boolean)
		If Result = False Then
			ToastMessageShow("No permission!", True)
			Activity.Finish
			Return
		End If
	Next
	
	'SetState(False, False, VideoMode)
	Wait For (cam.OpenCamera(front)) Complete (TaskIndex As Int)
	If TaskIndex > 0 Then
		MyTaskIndex = TaskIndex 'hold this index. It will be required in later calls.
		Wait For(PrepareSurface) Complete (Success As Boolean)
	End If
	Log("Start success: " & Success)
	'SetState(Success, False, VideoMode)
	If Success = False Then
		ToastMessageShow("Failed to open camera", True)
	End If
End Sub


Sub PrepareSurface As ResumableSub
	'SetState(False, busystate, VideoMode)
	'sizes can be modified here
	If VideoMode Then
		cam.PreviewSize.Initialize(640, 480)
		ResizePreviewPanelBasedPreviewSize
		'Using a temporary file to store the video.
		Wait For (cam.PrepareSurfaceForVideo(MyTaskIndex, VideoFileDir, "temp-" & VideoFileName)) Complete (Success As Boolean)
	Else
		cam.PreviewSize.Initialize(1920, 1080)
		ResizePreviewPanelBasedPreviewSize
'		For Each cs As CameraSize In cam.SupportedPreviewSizes
'			Log(cs)
'		Next
		Wait For (cam.PrepareSurface(MyTaskIndex)) Complete (Success As Boolean)
	End If
	
	If Success Then cam.StartPreview(MyTaskIndex, VideoMode)
	'SetState(Success, busystate, VideoMode)
	Return Success
End Sub

Private Sub ResizePreviewPanelBasedPreviewSize
	Dim pw = cam.PreviewSize.Height, ph = cam.PreviewSize.Width As Int
	Dim r As Float = Max(Activity.Width / pw, Activity.Height / ph)  'FILL_NO_DISTORTIONS (change to Min for FIT)
	Dim w As Int = pw * r
	Dim h As Int = ph * r
	pnlCamera.SetLayoutAnimated(0, Round(Activity.Width / 2 - w / 2), Round(Activity.Height / 2 - h / 2), Round(w), Round(h))
End Sub

Private Sub Panel3_Touch (Action As Int, X As Float, Y As Float)
	
End Sub