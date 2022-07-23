(ns tailwind.app
  (:require [counter.app :refer [counter-app]]
            [reagent.dom :as dom]
            [tailwind.db :as db]
            [tailwind.views :as views]))

(defn app
  []
  (if (:auth? @db/state)
    [views/authenticated]
    [views/public]))


(def dom-node (.getElementById js/document "app"))



;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (dom/render [#_app counter-app] dom-node))

(defn init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))
