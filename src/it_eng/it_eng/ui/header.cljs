(ns it-eng.it-eng.ui.header)

(defn navbar []
  [:div.navbar
   [:ul.navbar-nav
    [:li.nav-item [:a.nav-link "Home"]]
    [:li.nav-item [:a.nav-link "Курсы и цены"]]
    [:li.nav-item [:a.nav-link "Контакты"]]
    [:li.nav-item [:a.nav-link "Блог"]]]])

(defn header []
  [:header.page-header 
   [navbar]
   ])