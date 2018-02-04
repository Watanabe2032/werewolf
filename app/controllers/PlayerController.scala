package controllers

import play.libs.Json;
import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Form._
import play.api.data.Forms._
import play.mvc.Http.Request
import play.twirl.api.Html


@Singleton
class PlayerController @Inject() extends Controller {

  def gameState: Html = Html(s"""<div>game state</div>""")
  def playerState: Html = Html(s"""<div>player state</div>""")
  def voteSpace: Html = Html(s"""<div>vote space</div>""")
  def gameLog: Html = Html(s"""<div>game log</div>""")

  def index = Action { request => 
    Ok(views.html.playerMain(
      request.getQueryString("name").getOrElse("no name"),
      gameState,
      playerState,
      voteSpace,
      gameLog
    ))
  }

}