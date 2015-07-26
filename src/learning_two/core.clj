(ns learning-two.core)

(defn inc-first [nums]
  (cons (inc (first nums))
        (rest nums)))

(defn first-element [sequence default]
  (if (empty? sequence)
    default
    (first sequence)))

(defn expand [f x count]
  (if (pos? count)
    (cons x (expand f (f x) (dec count)))))
