(ns learning-two.core-test
  (:require [clojure.test :refer :all]
            [learning-two.core :refer :all])
  (:use midje.sweet))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0))))

(deftest inc-first-test
          (testing "first test"
            (is (= '(2 2 3) (inc-first [1 2 3])))))

(fact "default value is returned for empty sequences"
      (first-element [] :default) => nil
      (first-element '() :default) => nil
      (first-element nil :default) => :default
      (first-element (filter even? [1 3 5]) :default) => nil)