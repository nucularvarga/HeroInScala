package models

import play.api.data.Form
import play.api.data.Forms._

case class MyRadioButtonForm(yesOrNo:String)

object MyRadioButtonForm {

  val form: Form[MyRadioButtonForm] = Form(
    mapping(
      "yesOrNo" -> nonEmptyText,
    )(MyRadioButtonForm.apply)(MyRadioButtonForm.unapply)
  )
}
