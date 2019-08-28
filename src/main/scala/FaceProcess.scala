package face.process

import java.awt.Color
import scalismo.io.MeshIO
import java.io.File
import scalismo.ui.api.ScalismoUI

object FaceProcess {
  scalismo.initialize()

  val ui = ScalismoUI()

  val mesh = MeshIO.readMesh(new File("data/facemesh.stl")).get

  val meshView = ui.show(mesh, "face")

  meshView.color = Color.PINK
}
