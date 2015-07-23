(ns learning-two.core)

(defn inc-first [nums]
  (cons (inc (first nums))
        (rest nums)))

(defn first-element [sequence default]
  (if (nil? sequence)
    default
    (first sequence)))
