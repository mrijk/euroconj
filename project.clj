(defproject euroconj "1.0.0-SNAPSHOT"
  :description "FIXME: write"
  :namespaces [euroconj.core]
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "0.6.2"]
                 [ring/ring-servlet "0.3.7"]]
  :compile-path "war/WEB-INF/classes"
  :library-path "war/WEB-INF/lib")
