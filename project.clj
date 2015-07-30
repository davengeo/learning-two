(defproject learning-two "0.1.0-SNAPSHOT"
  :description "different katas in clojure"
  :url "http://twitter.com/davengeo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"],
                                  [criterium "0.4.3"],
                                  [cheshire "5.5.0"]]}})