(ns it-eng.it-eng.ui.header)

(defn navbar []
  [:div.navbar
   [:ul.navbar-nav
    [:li.nav-item [:a.nav-link "Home"]]
    [:li.nav-item [:a.nav-link "About"]]
    [:li.nav-item [:a.nav-link "Contact"]]]])

(defn header []
  [:header.page-header 
   [:h1.header-title "Английский для специалистов в ИТ"]
   [navbar] ])