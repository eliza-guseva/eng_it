(ns it-eng.it-eng.ui.main
  [:require [it-eng.it-eng.ui.main-content :as main-content]])


(defn whyus-text [reason]
  [:p  {:style {:margin "1px"}} reason])


(defn whyus-toprow []
  [:div.whyus-toprow
   [:div.whyus-header
    [:h1.whyus-header "Почему мы"]]
   [:div.whyus-top1
    (whyus-text main-content/whyus1)]
   ])




(defn whyus-bottomrow []
  [:div.whyus-bottomrow
   [:div.whyus-top3
    (whyus-text main-content/whyus2)]
   [:div.whyus-top3
    (whyus-text main-content/whyus3)]])

(defn section-why-us []
  [:section.why-us
   [whyus-toprow]
   [whyus-bottomrow]]
   )

(defn main []
    [:div.main
     [section-why-us]
     ])