package edu.catchy.ui.feedList.model

import javafx.beans.property.{SimpleObjectProperty, ObjectProperty}
import javafx.collections.FXCollections
import scala.beans.BeanProperty
import java.util

/**
 * irina
 * Date: 6/26/13
 * Time: 6:48 PM
 */
class FeedListContext {
  @BeanProperty val folders: util.List[Listable] = FXCollections.observableArrayList()
  val foldersProperty: ObjectProperty[util.List[Listable]] = new SimpleObjectProperty[util.List[Listable]](this, "folders")
}
