(ns om-css.devcards.bugs
  (:require-macros [devcards.core :as dc :refer [defcard deftest]]
                   [cljs.test :refer [is testing async]])
  (:require [devcards-om-next.core :as don :refer-macros [defcard-om-next]]
            [goog.dom :as gdom]
            [om.next :as om]
            [om-css.dom :as dom]
            [om-css.core :as oc :refer-macros [defui defcomponent]]))

;;====================
;; OMCSS-2

(defcomponent omcss-2-component [{:keys [a b] :as props} children]
  (dom/div nil
    (dom/p nil (str "prop a: " a))
    (dom/p nil (str "prop b: " b))))

(defcard omcss-2-card
  "Test that destructuring works in defcomponent's args"
  (omcss-2-component {:a 1 :b 2}))