(ns it-eng.it-eng.ui.main
  [:require [it-eng.it-eng.ui.main-content :as main-content]])

(defn section-image-headline []
  [:section.image-headline
   [:div.header-content-left
    [:h1.header-title "Английский для специалистов в ИТ"]
    [:h2.header-subtitle "Интервью в европейских и американских компаниях без боли и страха."]]
   [:div.header-content-right
    [:img.header-img {:src "images/head_image.jpg"}]]]
  )

(defn section-why-us []
  [:section.why-us
   
   [:h2.why-us-title "Почему мы?"]

   [:div.why-us-cards
  [:div1.whyus-div [:p main-content/whyus1]]
  [:div2.whyus-div [:p main-content/whyus2]]
  [:div3.whyus-div [:p main-content/whyus3]]
  [:div4.whyus-div [:p main-content/whyus4]]]
   
  [:div.why-us-cards
   [:div5.whyus-div [:p main-content/whyus5]]
  [:div6.whyus-div [:p main-content/whyus6]]
  [:div7.whyus-div [:p main-content/whyus7]]
  [:div8.whyus-div [:p main-content/whyus8]]]
   
   ])

(defn main []
    [:div.main
     [section-image-headline]
     [section-why-us]])