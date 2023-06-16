(ns it-eng.it-eng.ui.header)

(defn horizontal-line []
  [:div.hl {:style {:border-bottom "2px solid black"}}])

(defn title []
    [:div.head-title-text
    [:h1.head-text-top "The Language"]
    [:h1.head-text-bottom "of Technology"]]
  )

(defn section-title []
  [:div.section-title
   [title]
    [horizontal-line]
   [:p.head-sub "Английский для IT-специалистов"]
   [:p.head-sub "Интервью в компаниях США и Европы без боли и страха."]
    ])

(defn navbar []
  [:div.navbar
   [:ul.navbar-nav
    [:li.nav-item [:a.nav-link "На заглавную"]]
    [:li.nav-item [:a.nav-link "Курсы и цены"]]
    [:li.nav-item [:a.nav-link "Как с нами связаться"]]
    [:li.nav-item [:a.nav-link "Блог"]]]])

(defn header []
  [:header.page-header 
   [section-title]
   [navbar]
   ])