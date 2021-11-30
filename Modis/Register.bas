B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private EditText1 As EditText
	Private EditText2 As EditText
	Private EditText3 As EditText
	Private EditText4 As EditText
	Private Label7 As Label
	Private Button1 As Button
	Private PanelMessage As Panel
	Private Button2 As Button
	Private Label10 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Dim jo As JavaObject
	Dim window As JavaObject = jo.InitializeContext.RunMethod("getWindow", Null)
	window.RunMethod("addFlags", Array(Bit.Or(0x00000200, 0x08000000)))
	Activity.Height = Activity.Height + 24dip
	Activity.LoadLayout("Register")
	
	general.SetBackgroundTintList(EditText1,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText2,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText3,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText4,Colors.White,Colors.White)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Label7_Click
	StartActivity(Main)
	Activity.Finish
End Sub

Private Sub Button1_Click
	PanelMessage.SetVisibleAnimated(200,True)
End Sub

Private Sub Button2_Click
	PanelMessage.SetVisibleAnimated(200,False)
End Sub

Private Sub Label10_Click
	PanelMessage.SetVisibleAnimated(200,False)
End Sub

Private Sub PanelMessage_Touch (Action As Int, X As Float, Y As Float)
	
End Sub