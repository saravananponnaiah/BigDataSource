package scala.assignment17

trait MusicAudio {
  def playAudio() : Unit = {
    println("Play the music audio")
  }
}

trait MusicVideo {
  def playVideo() : Unit = {
    println("Playing the music video")
  }
}

// Class inherits both MusicVideo and MusicAudio using Trait & Mixin concept
class Song extends MusicVideo with MusicAudio {
  def play() : Unit = {
    println("Play function is initiated...")
  }
}

// This program explains the implementation of Traits and Mixin concepts to achieve Multiple Inheritance
object Task2 {
  def main(args : Array[String]) : Unit = {
    var song : Song = new Song()
    println("----------------------------")
    song.play()
    song.playAudio()
    song.playVideo()
    println("----------------------------")
  }
}

