(ns it-eng.core
  (:require ["react-dom/client" :refer [createRoot]]
            [goog.dom :as gdom]
            [reagent.core :as r]))

(defn app []
  [:main.app
   [:div  {:class "container"}
    [:div {:class "row"}
     [:div {:class "col-md-12"}
      [:h1 "Hello, world!"]]]]])


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
