(ns it-eng.core
  (:require ["react-dom/client" :refer [createRoot]]
            [goog.dom :as gdom]
            [reagent.core :as r]
            [it-eng.it-eng.ui.header :refer [header]]
            [it-eng.it-eng.ui.sidebar :refer [sidebar]]
             [it-eng.it-eng.ui.main :refer [main]]))

(defn app []
  [:main.app
   [:div  [header]]
   [:div.body-div
    [sidebar] [main]]])


(defonce root (createRoot (gdom/getElement "app")))

(defn init
  []
  (.render root (r/as-element [app])))

(defn reload []
  (init))

(defn ^:dev/after-load re-render
  []
  ;; The `:dev/after-load` metadata causes this function to be called
  ;; after shadow-cljs hot-reloads code.
  ;; This function is called implicitly by its annotation.
  (init))
