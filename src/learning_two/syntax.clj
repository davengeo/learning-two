(ns learning-two.syntax
  (:use midje.sweet))

(fact "let binds symbol with value"
       (let [person "David" num-cats 186]
         (str person " has " num-cats " cats!")) => "David has 186 cats!")

(fact "comma is used as whitespace"
      (let [person "David", num-cats 186]
        (str person " has " num-cats " cats!")) => "David has 186 cats!")

(fact "quote escapes the form"
      (loop [x 10 result []]
        (when (> x 1)
          (conj x result)
          (recur [x result]))) => "this is this")