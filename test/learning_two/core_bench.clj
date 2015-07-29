(ns learning-two.core-bench
  (:require [clojure.test :refer :all]
            [learning-two.core :refer :all]
            [criterium.core :as bench]))

;beautiful example in
; https://raw.githubusercontent.com/dakrone/cheshire/master/benchmarks/cheshire/test/benchmark.clj

(deftest t-bench-use-helper
  (println "-------- learning Benchmarks --------")
  (bench/with-progress-reporting
    (bench/quick-bench
      (use-helper [1 2 3]) :verbose))
  (println "-------------------------------------"))
