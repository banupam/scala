package funsets

object Main extends App {
  import FunSets._
  
//  println(contains(singletonSet(0), 0))
  
  val s0 = singletonSet(0)
  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)

  val s = union(s1, union(s2, s3))
  val t = union(s1, s3)
  val u = map(s, (_:Int) * 2)

  println(forall(s, (_:Int) % 2 == 0))
  println(forall(t, (_:Int) % 2 == 0))
  println(forall(u, (_:Int) % 2 == 0))


  println(forall(s, (_:Int) % 2 != 0))
  println(forall(t, (_:Int) % 2 != 0))
  println(forall(u, (_:Int) % 2 != 0))
  
 
  println(exists(s, (_:Int) % 2 == 0))
  println(exists(t, (_:Int) % 2 == 0))
  println(exists(u, (_:Int) % 2 == 0))
  
  println(exists(s, (_:Int) % 2 != 0))
  println(exists(t, (_:Int) % 2 != 0))
  println(exists(u, (_:Int) % 2 != 0))
   
  printSet(s)
  printSet( map(s, (x:Int) => (x*2:Int) ))
  
}
