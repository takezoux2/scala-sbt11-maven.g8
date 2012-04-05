package $groupId$

import org.specs2._

class Spec2Test extends SpecificationWithJUnit{ def is =
  "sample test"                      ^
    "must pass the test"     ! test1 ^
                                 end
  
  
  def test1 = true must_== true
  
}