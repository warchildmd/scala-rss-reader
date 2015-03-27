package reader

import reader.rss.RSSFeedParser

object Reader {

  def main(args: Array[String]): Unit = {
    val feedWSJ = RSSFeedParser readFeed "http://www.wsj.com/xml/rss/3_7085.xml"
    feedWSJ.get.messages foreach(feedMessage => {
      println(feedMessage.title)
    })

    val feedECO = RSSFeedParser readFeed "http://www.economist.com/sections/business-finance/rss.xml"
    feedECO.get.messages foreach(feedMessage => {
      println(feedMessage.title)
    })

    val feedADE = RSSFeedParser readFeed "http://adevarul.ro/rss/"
    feedADE.get.messages foreach(feedMessage => {
      println(feedMessage.title)
    })
  }
}
