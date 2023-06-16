(ns it-eng.it-eng.ui.main
  [:require [it-eng.it-eng.ui.main-content :as main-content]])


(defn whyus-toprow []
  [:div.whyus-toprow
   [:div.whyus-top1
    [:p main-content/whyus1]]
   [:div.whyus-header
    [:h1.whyus-header "Почему мы"]]
   ])


(defn whyus-bottomrow []
  [:div.whyus-bottomrow
   [:div.whyus-2
    [:p main-content/whyus2]]
   [:div.whyus-3
    [:p main-content/whyus3]]])

(defn section-why-us []
  [:section.why-us
   [whyus-toprow]
   [whyus-bottomrow]]
   )

(defn main []
    [:div.main
     [section-why-us]
     ])