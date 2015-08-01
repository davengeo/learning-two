(ns learning-two.structures
  (:use midje.sweet))


(def baselist (list :pedro :miki))

(def lst1 (cons :monica baselist))
(def lst2 (cons :david baselist))

(fact "they both are composed of baselist"
      (= (next lst1) (next lst2)) => true)

(fact "they both are identical!!!"
      (identical? (next lst1) (next lst2)) => true)

(def my-tree {:val 50, :L nil, :R nil})
