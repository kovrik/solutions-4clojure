(defn nk [k m] (and (contains? m k) (nil? (k m))))

(true?  (nk :a {:a nil :b 2}))

(false? (nk :b {:a nil :b 2}))

(false? (nk :c {:a nil :b 2}))
