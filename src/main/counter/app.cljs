(ns counter.app)


;; Our Counter Component
;; Hiccup Basics
;; 1. keyword/symbol
;; 1.1 keyword -> html tag
;; 1.2 symbol - component
;; 2 Optional map of attributes
;; 3 String/Child Node
(defn counter-app []
  [:div.container
   [:h1  (str "Counter: " 0)]
   [:button.btn.btn-increment "+"]])
