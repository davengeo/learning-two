(ns learning-two.core-test
  (:require [clojure.test :refer :all]
            [learning-two.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0))))

(deftest inc-first-test
          (testing "first test"
            (is (= '(2 2 3) (inc-first [1 2 3])))
            )
          )
