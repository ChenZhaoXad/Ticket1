package com.goticks

import akka.actor.{Actor, ActorRef, Props}

trait BoxOfficeCreator { this: Actor =>
  def createBoxOffice:ActorRef = {
    context.actorOf(Props[BoxOffice], "boxOffice")
  }
}