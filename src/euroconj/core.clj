(ns euroconj.core
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use compojure.core
        ring.util.servlet)
  (:require [compojure.route :as route]))

(defroutes example
  (GET "/" [] "<h1>First European Clojure Conference!</h1>")
  (route/not-found "Page not found"))

 (defservice example)

