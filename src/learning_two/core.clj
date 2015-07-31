(ns learning-two.core
  (:require
      [clojure.zip :as zip]
      [learning-two.custom-helper :as custom]
      [cheshire.core :refer :all] :verbose))

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

(defn my-repl [] (-> (read) (eval) (println) (loop-forever)))

(def myagent (agent 0))

(defn use-helper [coll]
  (custom/helperize coll))

(defn rest-match [x]
  "rest of string x matchs x with (.+):(.+)"
  ^:learning
  (rest (re-matches #"(.+):(.+)" x)))

(defn json-test []
  (generate-string {:foo "bar"}))

;editing trees with zip
;http://www.exampler.com/blog/2010/09/01/editing-trees-in-clojure-with-clojurezip

(def original [1 '(a b c) 2])
(def root-loc (zip/seq-zip (seq original)))
(defn navigate []
  (-> root-loc zip/down zip/right zip/node))

(defn print-tree [original]
  (loop [loc (zip/seq-zip (seq original))]
    (if (zip/end? loc)
      (zip/root loc)
      (recur (zip/next
               (do (println (zip/node loc))
                   loc))))))