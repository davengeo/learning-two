(ns learning-two.core)

(defn inc-first [nums]
  (cons (inc (first nums))
        (rest nums)))
