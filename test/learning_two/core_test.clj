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

(fact ""
      (expand inc 0 10) => '(0 1 2 3 4 5 6 7 8 9))

