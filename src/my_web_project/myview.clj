(ns my-web-project.myview
  (:use hiccup.page hiccup.element))

(defn index-page []
  (html5
    [:html
     [:head]
     [:body "the index-page"]]))