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

(fact "expans a range from 0 to 10 into a vector"
      (expand inc 0 10) => '(0 1 2 3 4 5 6 7 8 9))

(fact "sum_odds just sum the odds of a sequence ended by x-1"
      (sum_odds 10) => 25
      (sum_odds 1)  => 0 ; this is odd, but the sequence doesn't reach 1
      (sum_odds 3)  => 1
      (sum_odds 0)  => 0)
