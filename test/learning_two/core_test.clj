(ns learning-two.core-test
  (:require [clojure.test :refer :all]
            [learning-two.core :refer :all])
  (:use midje.sweet))

(deftest inc-first-test
          (testing "first test"
            (is (= '(2 2 3) (inc-first [1 2 3])))))

(fact "default value is returned for empty sequences"
      (first-element [] :default) => :default
      (first-element '() :default) => :default
      (first-element nil :default) => :default
      (first-element (filter even? [1 3 5]) :default) => :default)

(fact "use expand to create a sequence"
      (expand inc 0 10) => '(0 1 2 3 4 5 6 7 8 9))

(fact "sum_odds just sum the odds of a sequence ended by x-1"
      (sum_odds 10) => 25
      (sum_odds 1)  => 0 ; this is odd, but the sequence doesn't reach 1
      (sum_odds 3)  => 1
      (sum_odds 0)  => 0)

(fact @myagent => 0)

(deftest test-use-helper
  (testing "use of helper"
    (is (= 1 (use-helper [1 2 3])))))

(fact "rest-match specs"
      (rest-match "as:ds") => '("as" "ds")
      (rest-match "as") => ()
      (rest-match "") => ())

(fact "rest-match also bring its metadata"
      (:learning (meta rest-match)) => nil)

(fact "test over json cheshire lib"
      (json-test) => "{\"foo\":\"bar\"}")

(fact "navigate a tree with zip"
      (navigate) => '(a b c))

(fact "this fact shows the tree members in sysout, have a look"
      (print-tree [1 '(a (i ii iii) c) 2]) => '(1 (a (i ii iii) c) 2))