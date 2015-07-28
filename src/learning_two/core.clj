(ns learning-two.core
  (:require learning-two.helper))

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

; some macros now

;eval in the way of fluent api
(defn sum_odds [x]
  (->> (range x) (filter odd?) (reduce +)))

;this macro helps to create my own REPL, LOL
(defmacro loop-forever [& body] `(loop [] ~@body (recur)))

(defn my-repl [] ( -> (read) (eval) (println) (loop-forever)))

(def myagent (agent 0))

(defn use-helper [coll]
  (helper coll))