import org.specs2._

class Spec2Test extends SpecificationWithJUnit{ def id =
  "sample test"                      ^
    "must pass the test"     ! test1 ^
                                 end
  
  
  def test1 = true must_== true
  
}