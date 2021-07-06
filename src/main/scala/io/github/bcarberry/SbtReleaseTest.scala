package io.github.bobcarberry

object SbtReleaseTest {
  def main(args: Array[String]): Unit = {
    val version = getClass.getPackage.getImplementationVersion
    println(s"version=$version")
  }
}
