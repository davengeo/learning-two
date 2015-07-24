(ns learning-two.core)

(defn inc-first [nums]
  (cons (inc (first nums))
        (rest nums)))

(defn first-element [sequence default]
  (if (empty? sequence)
    default
    (first sequence)))
